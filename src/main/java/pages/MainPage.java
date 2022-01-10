package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import utils.LocatorsMainPage;

@Log4j2
public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        log.info("Open Main Page {}", LocatorsMainPage.BASE_URN);
        driver.get(LocatorsMainPage.BASE_URN);
    }

    public void clickCookiesBtn(){
        log.info("Click {}", LocatorsMainPage.COOKIES_BTN);
        findElementXpath(driver,LocatorsMainPage.COOKIES_BTN).click();
    }

    public void clickFirstAddToCartBtn(){
        log.info("Click {}", LocatorsMainPage.ADD_TO_CART_LIST);
        findElementsXpath(driver,LocatorsMainPage.ADD_TO_CART_LIST).get(0).click();
    }

}
