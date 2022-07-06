package testcases;

import basepackage.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.StoreHomePage;
import pageobjects.StoreProductPage;
import utility.Logger;

import java.io.IOException;
import java.time.Duration;

public class StoreHomePageTest extends DriverFactory {

    public StoreHomePageTest() throws IOException {
        super();
    }

    @Test
    public void storeHomePageTest001() throws IOException, InterruptedException {
        HomePage homepage=new HomePage();
        Thread.sleep(3000);
        //homepage.getToggle().click();
        homepage.getTestStoreLink();

        StoreHomePage storeHomePage=new StoreHomePage();
        storeHomePage.getProdTwo().click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(storeHomePage.getProdOne()));

        StoreProductPage storeProductPage=new StoreProductPage();
        Select dropDownItem=new Select(storeProductPage.getSizeOption());
        dropDownItem.selectByVisibleText("M");
        storeProductPage.getQuantIncrease().click();
        storeProductPage.getAddToCartBtn().click();
        Logger.debug("Product added to the Cart");

    }

    }
