package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class AbstractElements {

    protected WebDriver driver;
    protected WebDriverWait explicitlyWait;


    public AbstractElements(WebDriver driver) {
        this.driver = driver;
        this.explicitlyWait = new WebDriverWait(driver, 10);
    }

    public WebElement findElementXpath(WebDriver driver, String label) {
        this.driver = driver;
        return driver.findElement(By.xpath(label));
    }

    public WebElement findElementID(WebDriver driver, String label) {
        this.driver = driver;
        return driver.findElement(By.id(label));
    }

    public List<WebElement> findElementsXpath(WebDriver driver, String label) {
        this.driver = driver;
        return driver.findElements(By.xpath(label));
    }

    public void frameToBeAvailableAndSwitchToIt(WebDriver driver, String label) {
        this.driver = driver;
        explicitlyWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(label)));
    }

    public void elementToBeClickableAndClickXpath(WebDriver driver, String label) {
        this.driver = driver;
        explicitlyWait.until(ExpectedConditions.elementToBeClickable(By.xpath(label))).click();
    }

    public void elementToBeClickableAndClickID(WebDriver driver, String label) {
        this.driver = driver;
        explicitlyWait.until(ExpectedConditions.elementToBeClickable(By.id(label))).click();
    }

    public void elementToBeClickableAndSendKeys(WebDriver driver, String label, String value) {
        this.driver = driver;
        explicitlyWait.until(ExpectedConditions.elementToBeClickable(By.xpath(label))).sendKeys(value);
    }

}