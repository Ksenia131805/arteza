package Helpers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class Helpers {

    public static String wingHandleBefore;

    public static void switchToNewBrowserTab(WebDriver driver) {
        wingHandleBefore = driver.getWindowHandle();
        log.info("Check to IFrame and click {}", driver.getWindowHandle());
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public static void switchToFirstBrowserTab(WebDriver driver) {
        log.info("Check to IFrame and click {}", driver.getWindowHandle());
        driver.close();
        driver.switchTo().window(wingHandleBefore);
    }
}
