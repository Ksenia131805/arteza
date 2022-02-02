package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

@Log4j2
public class MainPage extends BasePage {

    @FindBy(xpath = "//a[@id='CybotCookiebotDialogBodyButtonAccept']")
    private WebElement cookieBtn;

    @FindBy(xpath = "//button[contains(text(), 'Add To Cart')]")
    private List<WebElement> addToCartBtn;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        openPage("");
    }

    public void clickCookiesBtn() {
        log.info("Click {}", cookieBtn);
        waitForElementToBeClickable(cookieBtn).click();
    }

    public void clickFirstAddToCartBtn() {
        log.info("Click {}", addToCartBtn);
        waitForElementToBeClickable(addToCartBtn.get(0)).click();
    }
}
