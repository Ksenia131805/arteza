package steps;

import org.openqa.selenium.WebDriver;

public class UserSteps {

    public MainSteps mainSteps;
    public SlideOutSteps slideOutSteps;
    public CartPageSteps cartPageSteps;

    public UserSteps(WebDriver driver) {
        this.mainSteps = new MainSteps(driver);
        this.slideOutSteps = new SlideOutSteps(driver);
        this.cartPageSteps = new CartPageSteps(driver);
    }
}
