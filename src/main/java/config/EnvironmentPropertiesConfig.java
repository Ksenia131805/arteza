package config;

import model.EnvironmentProperties;

public class EnvironmentPropertiesConfig extends EnvironmentConfigReader {

    public EnvironmentPropertiesConfig(String fileName, String envName) {
        super(fileName, envName);
    }

    public static EnvironmentPropertiesConfig getEnvConfig() {
        return new EnvironmentPropertiesConfig("enviroment.conf", "paramUsChrome");
    }

    public static EnvironmentProperties getBodyProperties() {
        return (EnvironmentProperties) getEnvironmentConfig(EnvironmentProperties.class);
    }
}
