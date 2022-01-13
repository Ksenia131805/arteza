package Helpers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class WindowsHelpers {

    public static void switchToFirstNewBrowserTab(WebDriver driver) {
        log.info("Check to IFrame and click {}");
        driver.switchTo().window(driver.getWindowHandles().stream().filter(h -> !h.equals(driver.getWindowHandle())).findFirst().get());
    }

    public static void switchToFirstBrowserTab(WebDriver driver) {
        log.info("Check to IFrame and click {}");
        driver.close();
        driver.switchTo().window("");
    }
}
