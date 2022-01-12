package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

@Log4j2
public class MainPage extends BasePage {

    @FindBy (xpath = "//a[@id='CybotCookiebotDialogBodyButtonAccept']")
    private WebElement cookieBtn;

    @FindBy (xpath = "//button[contains(@id, 'addProductToCartBtn')]")
    private List<WebElement> addToCartBtn;

    public static final String BASE_URN = "https://arteza.com";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        log.info("Open Main Page {}", BASE_URN);
        driver.get(BASE_URN);
    }

    public void clickCookiesBtn() {
        log.info("Click {}", cookieBtn);
        elementToBeClickable(cookieBtn);
        cookieBtn.click();
    }

    public void clickFirstAddToCartBtn() {
        log.info("Click {}", addToCartBtn);
        elementToBeClickable(addToCartBtn.get(0));
        addToCartBtn.get(0).click();
    }
}
