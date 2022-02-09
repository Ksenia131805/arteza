package tests.payPal;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.BaseTest;


public class PayPalTest extends BaseTest {

    @Test
    @Description(value = "Paypal Test")
    public void openMainPageTest() {
        user.mainSteps
                .openMainPage()
                .clickCookiesBtn()
                .clickFirstAddToCartBtn();
        user.slideOutSteps
                .clickViewCart();
        user.cartPageSteps
                .clickToPaypalBtn()
                .switchToNewTabAndEnterEmail()
                .clickToNxtBtn()
                .switchToFirstTab()
                .clickToCheckoutBtn();
    }
}
