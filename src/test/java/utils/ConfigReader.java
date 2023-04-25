package utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    /**
     * this method will read any property file
     * it will have all the information from the file we provided in the path
     *
     * @param filePath
     * @return
     */
    public static Properties readProperties(String filePath) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * This method will get a specific value based on the key
     *
     * @param key
     * @return
     */
    public static String getPropertyValue(String key) {
        return properties.getProperty(key);
    }
}
