package utils;

public class LocatorsCartPage {
    public static final String PAYPAL_FRAME ="//iframe[contains(@name,'zoid__paypal_buttons')]";
    public static final String PAYPAL_BTN = "//div[./img[@class = 'paypal-logo paypal-logo-paypal paypal-logo-color-blue']]";
    public static final String CHECKOUT_BTN = "//div[contains(@class,'cart__total')]/descendant::a[text()='Proceed to Checkout']";
}
