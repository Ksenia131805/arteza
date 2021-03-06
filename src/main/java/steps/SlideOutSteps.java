package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SlideOutPage;

@Log4j2
public class SlideOutSteps extends AbstractStep {

    SlideOutPage slideOutPage = new SlideOutPage(driver);

    public SlideOutSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click view cart")
    public SlideOutSteps clickViewCart() {
        slideOutPage.clickViewCartBtn();
        return this;
    }

    @Step("Verify SlideOutPage")
    public SlideOutSteps verifyOpenSlideOutPage() {
        Assert.assertTrue(slideOutPage.getSlideOutLabel().isDisplayed());
        return this;
    }
}

