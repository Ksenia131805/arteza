package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import utils.LocatorsCartPage;
import utils.LocatorsPayPalPage;

@Log4j2
public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickPayPalBtn() {
        log.info("Check to IFrame and click {}", LocatorsCartPage.PAYPAL_BTN);
        frameToBeAvailableAndSwitchToIt(driver, LocatorsCartPage.PAYPAL_FRAME);
        elementToBeClickableAndClickXpath(driver, LocatorsCartPage.PAYPAL_BTN);
    }

    public void switchToNewBrowserTab() {
        log.info("Check to IFrame and click {}", driver.getWindowHandle());
        String wingHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        elementToBeClickableAndSendKeys(driver, LocatorsPayPalPage.EMAIL_FIELD, "dfgdfgdf");
        clickToNextBnt();
        driver.close();
        driver.switchTo().window(wingHandleBefore);
    }

    public void clickToNextBnt() {
        log.info("Click {}", LocatorsPayPalPage.NEXT_BTN);
        elementToBeClickableAndClickID(driver, LocatorsPayPalPage.NEXT_BTN);
    }

    public void clickToCheckoutBtn() {
        log.info("Click {}", LocatorsCartPage.CHECKOUT_BTN);
        elementToBeClickableAndClickXpath(driver, LocatorsCartPage.CHECKOUT_BTN);
    }
}
