package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import lombok.extern.log4j.Log4j2;
import pages.CartPage;

@Log4j2
public class CartPageSteps extends AbstractStep {
    public CartPageSteps(WebDriver driver) {
        super(driver);
    }

    CartPage cartPage = new CartPage(driver);

    @Step("Check to Iframe paypal and click paypal btn")
    public CartPageSteps clickToPaypalBtn() {
        cartPage.clickPayPalBtn();
        return this;
    }

    @Step("Switch to new tab")
    public CartPageSteps switchToNewTab() {
        cartPage.switchToNewBrowserTab();
        return this;
    }

    @Step("Click to next btn")
    public CartPageSteps clickToNxtBtn() {
        cartPage.clickToNextBnt();
        return this;
    }

    @Step("Switch to new tab")
    public CartPageSteps switchToFirstTab() {
        cartPage.switchToFirstBrowserTab();
        return this;
    }

    @Step("Click to checkout btn")
    public void clickToCheckoutBtn() {
        cartPage.clickToCheckoutBtn();
    }
}
