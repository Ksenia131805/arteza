package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;

public abstract class AbstractStep {
    WebDriver driver;

    public AbstractStep(WebDriver driver) {
        this.driver = driver;
    }

    protected void validatePageIsLoaded(BasePage page) {
        Assert.assertTrue(page.isPageLoaded());
    }
}
