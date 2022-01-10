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
        validatePageIsLoaded(cartPage);
        cartPage.clickPayPalBtn();
        return this;
    }

    @Step("Enter invalid email")
    public CartPageSteps enterInvalidEmail() {
        cartPage.switchToNewBrowserTab();
        return this;
    }
    @Step("Click to checkout btn")
    public void clickToCheckoutBtn() {
        validatePageIsLoaded(cartPage);
        cartPage.clickToCheckoutBtn();
    }
}
