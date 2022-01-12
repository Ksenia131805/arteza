package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class SlideOutPage extends BasePage {

    @FindBy(xpath = "//a[@class = 'cart-footer__cart-btn'] | //a[contains(@class, 'CartSubtotal-footer-cart')]")
    private WebElement viewCartBtn;

    public SlideOutPage(WebDriver driver) {
        super(driver);
    }

    public void clickViewCartBtn() {
        log.info("Click {}", viewCartBtn);
        elementToBeClickable(viewCartBtn);
        viewCartBtn.click();
    }
}
