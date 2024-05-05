package qa.core.utils.properties;

import qa.core.exceptions.NoPropertyFoundException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
    private final Properties properties = new Properties();

    public PropertiesUtils(FileReader fis) throws IOException {

            properties.load(fis);
    }
    public String getProperty(String key){
        String propertyValue = properties.getProperty(key);
        if(propertyValue == null){
            throw new NoPropertyFoundException(key);
        }
        return propertyValue;
    }
}
