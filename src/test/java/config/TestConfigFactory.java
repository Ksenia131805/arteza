package config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigBeanFactory;

public class TestConfigFactory {
    private Config config;
    private BodyProperties webConfig;

    private TestConfigFactory() {
        config = ConfigFactory.parseResources("test.conf");
    }

    public BodyProperties getWebConfig() {
        if (webConfig == null) {
            webConfig = ConfigBeanFactory.create(config.getObject("stageinUkChrome").toConfig(), BodyProperties.class);
        }
        return webConfig;
    }

    public static TestConfigFactory getInstance() {
        return new TestConfigFactory();
    }
}
