package tests;

import lombok.extern.log4j.Log4j2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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


    @BeforeMethod
    public void setup() {
        if (driver == null) {
            log.info("Driver initialization");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
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
