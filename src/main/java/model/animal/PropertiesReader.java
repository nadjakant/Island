package model.animal;

import lombok.Getter;
import lombok.Setter;

import java.io.InputStream;
import java.util.Properties;

@Getter
@Setter
public class PropertiesReader {
    private final String FILE_EXTENSION = ".properties";
    private final Properties properties;
    private String PACKAGE_NAME;


    PropertiesReader(String PACKAGE_NAME) {
        this.PACKAGE_NAME = PACKAGE_NAME;
        properties = new Properties();
    }

    public Properties loadProperties(String propertiesName) {

        try {
            Properties properties = new Properties();
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(PACKAGE_NAME +"/"+ propertiesName + FILE_EXTENSION);
            properties.load(inputStream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
        return properties;
    }


}
