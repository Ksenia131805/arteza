package model;

import driver.DriverInstance;

public class EnvironmentProperties {
    private String baseUrl;
    private DriverInstance.Browser browser;

    public String getUrl() {
        return baseUrl;
    }

    public void setUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public DriverInstance.Browser getBrowser() {
        return browser;
    }

    public void setBrowser(DriverInstance.Browser browser) {
        this.browser = browser;
    }

}
