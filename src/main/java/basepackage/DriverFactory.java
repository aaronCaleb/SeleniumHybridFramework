package basepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utility.ReadConfigFile;

import java.io.IOException;

public class DriverFactory extends BasePage {

    ReadConfigFile readConfigFile = new ReadConfigFile();

    public DriverFactory() throws IOException {
        super();
    }

    @BeforeClass
    public void setUp() throws IOException {
        getDriver().get(readConfigFile.getUrl());
    }

    @AfterClass
    public void tearDown() throws IOException {
        WebDriverInstance.cleanUpDriver();
    }
}
