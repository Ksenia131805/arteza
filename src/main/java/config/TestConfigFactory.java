package config;

import com.typesafe.config.*;
import model.BodyProperties;

public class TestConfigFactory {
    public static Config config;
    public static Object webConfig;

    private TestConfigFactory() {
        config = ConfigFactory.parseResources("enviroment.conf");
        setEnvName("paramUsChrome");
    }

    public static Object getWebConfig(Class<?> className) {
        if (webConfig == null) {
            webConfig = ConfigBeanFactory.create(config.getObject(System.getProperty("enviroment")).toConfig(), className);
        }
        return webConfig;
    }

    public static TestConfigFactory getEnvConfig() {
        return new TestConfigFactory();
    }

    public static BodyProperties getBodyProperties() {
        return (BodyProperties) getWebConfig(BodyProperties.class);
    }

    public void setEnvName(String params) {
        if (System.getProperty("enviroment") == null) {
            System.setProperty("enviroment", params);
        }
    }
}
