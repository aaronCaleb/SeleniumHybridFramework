package testcases;

import basepackage.DriverFactory;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import java.io.IOException;

public class HomePageTest extends DriverFactory {

    public HomePageTest() throws IOException {
        super();
    }

    @Test
    public void homePageTest001() throws IOException {
        HomePage homePage = new HomePage();
        homePage.getFileUploadLink().click();
        homePage.getAccordionLink().click();
    }

}

