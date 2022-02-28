package config;

import com.typesafe.config.*;
import model.EnvironmentProperties;
import utils.ConfigReader;

public class EnvironmentConfigReader extends ConfigReader {

    public static Object webConfig;

    public EnvironmentConfigReader(String fileName, String envName) {
        ConfigReader.ConfigReader(fileName);
        setEnvironmentName(envName);
    }

    public static Object getEnvironmentConfig(Class<?> className) {
        if (webConfig == null) {
            webConfig = ConfigBeanFactory.create(config.getObject(System.getProperty("enviroment")).toConfig(), className);
        }
        return webConfig;
    }

    public void setEnvironmentName(String params) {
        if (System.getProperty("enviroment") == null) {
            System.setProperty("enviroment", params);
        }
    }

    public EnvironmentProperties getBodyPropertiesClass() {
        return EnvironmentPropertiesConfig.getBodyProperties();
    }
}
