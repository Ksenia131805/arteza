package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.CartPageSteps;
import steps.MainSteps;
import steps.SlideOutSteps;

import java.util.concurrent.TimeUnit;

@Log4j2
public class BaseTest {

    protected WebDriver driver;
    protected MainSteps mainSteps;
    protected SlideOutSteps slideOutSteps;
    protected CartPageSteps cartPageSteps;

    public static WebDriver getWebDriver(String browser) {
        switch (browser) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "Safari":
                return new SafariDriver();
            default:
                return new ChromeDriver();
        }
    }

    private static void setConfigs(WebDriver driver) {
        log.info("Setup basic WebDriver configurations");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    @BeforeMethod
    public void setup() {
        if (driver == null) {
            log.info("Driver initialization");
            driver = getWebDriver("Chrome");
            setConfigs(driver);
            mainSteps = new MainSteps(driver);
            slideOutSteps = new SlideOutSteps(driver);
            cartPageSteps = new CartPageSteps(driver);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        log.info("Quit from driver");
        driver.quit();
        driver = null;
    }
}
