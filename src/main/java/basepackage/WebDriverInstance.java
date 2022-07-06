package basepackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.ReadConfigFile;

import java.io.IOException;
import java.time.Duration;

public class WebDriverInstance {

    public static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() throws IOException {
        if (driverThreadLocal.get() == null) {
            driverThreadLocal.set(createDriver());
        }
        return driverThreadLocal.get();
    }

    public static WebDriver createDriver() throws IOException {
        WebDriver driver = null;
        ReadConfigFile readConfigFile = new ReadConfigFile();

        if (readConfigFile.getBrowser().equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (readConfigFile.getBrowser().equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (readConfigFile.getBrowser().equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        return driver;


    }

    public static void cleanUpDriver() throws IOException {
        driverThreadLocal.get().quit();
        driverThreadLocal.remove();
    }
}
