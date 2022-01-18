package config;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConfigurationTest {

    public ConfigurationTest() {
        setEnvName();
    }

    public void setEnvName() {
        if (System.getProperty("enviroment") == null) {
            System.setProperty("enviroment", "paramUsFirefox");
        }
    }

}
