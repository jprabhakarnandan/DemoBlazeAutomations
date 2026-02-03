package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    // Load config.properties only once
    static {
        try {
            FileInputStream file = new FileInputStream(
                    "src/test/resources/config.properties"
            );
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("❌ config.properties file not found");
        }
    }

    // Generic method to get any value
    public static String get(String key) {
        return properties.getProperty(key);
    }

    // Optional specific methods (good for interview)
    public static String getBrowser() {
        return properties.getProperty("browser");
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }
}