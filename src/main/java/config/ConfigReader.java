package config;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.util.Properties;

@Slf4j
public class ConfigReader {

    private static Properties properties;

    static{
        properties = new Properties();
        try(FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fis);
            log.info("Properties loaded successfully");
        } catch (Exception e) {
            log.error("Error loading properties");
            e.printStackTrace();

        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
