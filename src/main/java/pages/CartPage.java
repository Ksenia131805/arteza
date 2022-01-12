package pages;

import Helpers.Helpers;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class CartPage extends BasePage {

    @FindBy(xpath = "//iframe[contains(@name,'zoid__paypal_buttons')]")
    private WebElement paypalFrame;

    @FindBy(xpath = "//div[./img[@class = 'paypal-logo paypal-logo-paypal paypal-logo-color-blue']]")
    private WebElement paypalBtn;

    @FindBy(xpath = "//div[contains(@class,'cart__total')]/descendant::a[text()='Proceed to Checkout']")
    private WebElement checkoutBtn;

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement emailField;

    @FindBy(id = "btnNext")
    private WebElement nextBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickPayPalBtn() {
        log.info("Check to IFrame and click {}", paypalBtn);
        frameToBeAvailableAndSwitchToIt(paypalFrame);
        elementToBeClickable(paypalBtn);
        paypalBtn.click();

    }

    public void switchToNewBrowserTab() {
        Helpers.switchToNewBrowserTab(driver);
        elementToBeClickable(emailField);
        emailField.sendKeys("dfgdfgdf");
    }


    public void clickToNextBnt() {
        log.info("Click {}", nextBtn);
        elementToBeClickable(nextBtn);
        nextBtn.click();
    }

    public void switchToFirstBrowserTab() {
        Helpers.switchToFirstBrowserTab(driver);
    }

    public void clickToCheckoutBtn() {
        log.info("Click {}", checkoutBtn);
        elementToBeClickable(checkoutBtn);
        checkoutBtn.click();
    }
}
