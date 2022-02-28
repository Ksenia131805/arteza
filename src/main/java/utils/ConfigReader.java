package utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ConfigReader {
    public static Config config;

    public static Config ConfigReader(String fileName) {
      return config = ConfigFactory.parseResources(fileName);
    }

}
