package pages;

import elements.AbstractElements;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

@Log4j2
public abstract class BasePage extends AbstractElements {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void waitPageLoaded() {
        ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
    }

    public boolean isPageLoaded() {
        try {
            waitPageLoaded();
        } catch (TimeoutException ex) {
            log.info("The page was not opened");
            return false;
        }
        return true;
    }
}
