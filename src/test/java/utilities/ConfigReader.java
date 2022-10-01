package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static { // her methoddan önce çalışır
      String dosyaYolu="target/configuration.properties";

      try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties= new Properties();
            properties.load(fis); // fis in okuduğu bilgileri prpoerties'e yükledi

        } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }


    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
