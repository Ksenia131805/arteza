package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractElements {

    protected WebDriver driver;
    protected WebDriverWait explicitlyWait;

    public AbstractElements(WebDriver driver) {
        this.driver = driver;
        this.explicitlyWait = new WebDriverWait(driver, 10);
    }

    public void frameToBeAvailableAndSwitchToIt(WebElement element) {
        explicitlyWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }

    public void elementToBeClickable(WebElement element) {
        explicitlyWait.until(ExpectedConditions.elementToBeClickable(element));
    }

}