package config;

import model.BodyProperties;

public class BodyPropertiesConfig extends MainConfigFactory {

    public BodyPropertiesConfig(String fileName, String envName) {
        super(fileName, envName);
    }

    public static BodyPropertiesConfig getEnvConfig() {
        return new BodyPropertiesConfig("enviroment.conf", "paramUsChrome");
    }

    public static BodyProperties getBodyProperties() {
        return (BodyProperties) getWebConfig(BodyProperties.class);
    }
}
