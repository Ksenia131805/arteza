package config;

public class BodyProperties {
    public String BASE_URN;
    private ConfigurationTest.Browser BROWSER;

    public String getBASE_URN() {
        return BASE_URN;
    }

    public void setBASE_URN(String BASE_URN) {
        this.BASE_URN = BASE_URN;
    }

    public ConfigurationTest.Browser getBROWSER() {
        return BROWSER;
    }

    public void setBROWSER(ConfigurationTest.Browser BROWSER) {
        this.BROWSER = BROWSER;
    }
}
