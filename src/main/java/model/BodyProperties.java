package model;

public class BodyProperties {
    private String baseUrl;
    private Browser browser;

    public String getbaseUrl() {
        return baseUrl;
    }

    public void setbaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }


    public enum Browser {
        CHROME, FIREFOX, SAFARI
    }
}
