package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class SlideOutPage extends BasePage {

    @FindBy(xpath = "//a[@class = 'cart-footer__cart-btn'] | //a[contains(@class, 'CartSubtotal-footer-cart')]")
    private WebElement viewCartBtn;


    @FindBy(xpath = "//div[contains(@class,'CartHeader-header-title-m13')]")
    private WebElement slideOutLabel;

    public SlideOutPage(WebDriver driver) {
        super(driver);
    }

    public void clickViewCartBtn() {
        log.info("Click {}", viewCartBtn);
        waitForElementToBeClickable(viewCartBtn).click();
    }


    public WebElement getSlideOutLabel() {
        log.info("View", slideOutLabel);
        waitElementToBeVisible(slideOutLabel);
        return slideOutLabel;
    }
}
