package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

@Log4j2
public class ConfigurationTest {

    private static TestConfigFactory config = TestConfigFactory.getInstance();

    public static WebDriver getWebDriver() {
        switch (config.getWebConfig().getBROWSER()) {
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

    public enum Browser {
        CHROME, FIREFOX, SAFARI
    }

    public static void setConfigs(WebDriver driver) {
        log.info("Setup basic WebDriver configurations");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static String getBaseUrl() {
        return config.getWebConfig().getBASE_URN();
    }
}
