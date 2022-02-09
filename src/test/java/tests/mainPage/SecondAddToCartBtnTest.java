package tests.mainPage;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SecondAddToCartBtnTest extends BaseTest {

    @Test
    @Description(value = "Add to second cart btn")
    public void openMainPageTest() {
        user.mainSteps
                .openMainPage()
                .clickCookiesBtn()
                .clickSecondAddToCartBtn();
        user.slideOutSteps
                .verifyOpenSlideOutPage();
    }
}