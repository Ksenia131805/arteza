package driver;

import config.TestConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

@Log4j2
public class DriverInstance {

    private static TestConfigFactory config = TestConfigFactory.getEnvConfig();

    public static WebDriver getWebDriver() {
        switch (config.getBodyProperties().getBrowser()) {
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
}
