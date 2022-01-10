package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import utils.LocatorsSlideOutPage;

@Log4j2
public class SlideOutPage extends BasePage {

    public SlideOutPage(WebDriver driver) {
        super(driver);
    }

    public void clickViewCartBtn() {
        log.info("Click {}", LocatorsSlideOutPage.VIEW_CART_BTN);
        findElementXpath(driver, LocatorsSlideOutPage.VIEW_CART_BTN).click();
    }
}
