package tests.mainPage;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.BaseTest;

public class FirstAddToCartBtnTest extends BaseTest {

    @Test
    @Description(value = "Add to first cart btn")
    public void clickToFirstAddToCartBtnTest() {
        user.mainSteps
                .openMainPage()
                .clickCookiesBtn()
                .clickFirstAddToCartBtn();
        user.slideOutSteps
                .verifyOpenSlideOutPage();
    }
}