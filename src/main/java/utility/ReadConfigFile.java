package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

    public static Properties properties;

    public ReadConfigFile() throws IOException {
        try{
            properties=new Properties();
            FileInputStream inputStream=new FileInputStream(
                    System.getProperty("user.dir") + "\\Configuration\\config.properties");
            properties.load(inputStream);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getBrowser(){
        String Browser= properties.getProperty("browser");
        return Browser;
    }

    public String getUrl(){
        String Url=properties.getProperty("url");
        return Url;
    }
}
