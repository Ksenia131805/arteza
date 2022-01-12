package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class PayPalTest extends BaseTest {

    @Test
    @Description(value = "Paypal Test")
    public void openMainPageTest() {
        mainSteps
                .openMainPage()
                .clickCookiesBtn()
                .clickFirstAddToCartBtn();
        slideOutSteps
                .clickViewCart();
        cartPageSteps
                .clickToPaypalBtn()
                .switchToNewTab()
                .clickToNxtBtn()
                .switchToFirstTab()
                .clickToCheckoutBtn();
    }
}
