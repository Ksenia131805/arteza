package steps;

import org.openqa.selenium.WebDriver;


public abstract class AbstractStep {
    WebDriver driver;

    public AbstractStep(WebDriver driver) {
        this.driver = driver;
    }


}
