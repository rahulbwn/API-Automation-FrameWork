package qa.core.utils.properties;

import qa.core.utils.files.FileUtils;

import java.io.FileReader;
import java.io.IOException;

public class FrameworkProperties {
    private static final String FRAMEWORK_PROP = "/src/main/resources/framework.properties";
    private static PropertiesUtils frameworkProperties;
    private static void loadFrameworkProperties() throws IOException{
        FileReader frameworkPropertiesFileReader = FileUtils.getFileReader(FRAMEWORK_PROP);
        frameworkProperties = new PropertiesUtils(frameworkPropertiesFileReader);
    }
    public static PropertiesUtils getFrameworkProperties() throws IOException{
        if(frameworkProperties == null){
            loadFrameworkProperties();
        }
        return frameworkProperties;
    }
}
