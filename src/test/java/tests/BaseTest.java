package tests;

import driver.DriverInstance;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.CartPageSteps;
import steps.MainSteps;
import steps.SlideOutSteps;


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
            driver = DriverInstance.getWebDriver();
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

    public void setConfigs(WebDriver driver) {
        log.info("Setup basic WebDriver configurations");
        driver.manage().window().maximize();
    }

}
