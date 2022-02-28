package pages;

import config.EnvironmentPropertiesConfig;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



@Log4j2
public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait explicitlyWait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        explicitlyWait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public String getBaseUrl() {
        return EnvironmentPropertiesConfig.getBodyProperties().getUrl();
    }

    public void openPage(String url) {
        log.info("Open Main Page {}", url);
        driver.get(getBaseUrl() + url);
    }

    public void frameToBeAvailableAndSwitchToIt(WebElement element) {
        explicitlyWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }

    public WebElement waitForElementToBeClickable(WebElement element) {
        return explicitlyWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitElementToBeVisible(WebElement element) {
        return explicitlyWait.until(ExpectedConditions.visibilityOf(element));
    }
}
