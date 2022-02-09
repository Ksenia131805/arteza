package tests;

import driver.DriverInstance;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.UserSteps;


@Log4j2
public class BaseTest {

    public UserSteps user;

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        if (driver == null) {
            log.info("Driver initialization");
            driver = DriverInstance.getWebDriver();
            setConfigs(driver);
            user = new UserSteps(driver);
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
