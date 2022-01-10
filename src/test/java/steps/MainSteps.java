package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

@Log4j2
public class MainSteps extends AbstractStep {

    MainPage mainPage = new MainPage(driver);

    public MainSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Open main page")
    public MainSteps openMainPage() {
        mainPage.openPage();
        validatePageIsLoaded(mainPage);
        return this;
    }

    @Step("Click cookie btn")
    public MainSteps clickCookiesBtn() {
        mainPage.clickCookiesBtn();
        validatePageIsLoaded(mainPage);
        return this;
    }

    @Step("Click first add to cart btn")
    public void clickFirstAddToCartBtn() {
        mainPage.clickFirstAddToCartBtn();
    }
}
