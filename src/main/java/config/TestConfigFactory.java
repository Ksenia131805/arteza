package config;

import com.typesafe.config.*;
import model.BodyProperties;

public class TestConfigFactory {
    private Config config;
    private BodyProperties webConfig;

    private TestConfigFactory() {
        config = ConfigFactory.parseResources("enviroment.conf");
    }

    public BodyProperties getWebConfig() {
        if (webConfig == null) {
            webConfig = ConfigBeanFactory.create(config.getObject(System.getProperty("enviroment")).toConfig(), BodyProperties.class);
        }
        return webConfig;
    }

    public static TestConfigFactory getInstance() {
        return new TestConfigFactory();
    }
}
