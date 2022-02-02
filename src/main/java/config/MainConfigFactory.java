package config;

import com.typesafe.config.*;
import model.BodyProperties;

public class MainConfigFactory {
    public static Config config;
    public static Object webConfig;

    public MainConfigFactory(String fileName, String envName) {
        config = ConfigFactory.parseResources(fileName);
        setEnvName(envName);
    }

    public static Object getWebConfig(Class<?> className) {
        if (webConfig == null) {
            webConfig = ConfigBeanFactory.create(config.getObject(System.getProperty("enviroment")).toConfig(), className);
        }
        return webConfig;
    }

    public void setEnvName(String params) {
        if (System.getProperty("enviroment") == null) {
            System.setProperty("enviroment", params);
        }
    }

    public BodyProperties getBodyPropertiesClass() {
        return BodyPropertiesConfig.getBodyProperties();
    }
}
