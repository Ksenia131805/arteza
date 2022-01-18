package tests;

import config.ConfigurationTest;
import config.TestConfigFactory;
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


@Log4j2
public class BaseTest extends ConfigurationTest {

    protected WebDriver driver;
    protected MainSteps mainSteps;
    protected SlideOutSteps slideOutSteps;
    protected CartPageSteps cartPageSteps;

    private static TestConfigFactory config = TestConfigFactory.getInstance();

    @BeforeMethod
    public void setup() {
        if (driver == null) {
            log.info("Driver initialization");
            driver = getWebDriver();
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

    public WebDriver getWebDriver() {
        switch (config.getWebConfig().getBrowser()) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case SAFARI:
                return new SafariDriver();
            default:
                return new ChromeDriver();
        }
    }

    public void setConfigs(WebDriver driver) {
        log.info("Setup basic WebDriver configurations");
        driver.manage().window().maximize();
    }

    public static String getBaseUrl() {
        return config.getWebConfig().getbaseUrl();
    }

}
