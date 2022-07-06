package testcases;

import basepackage.BasePage;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;
import pageobjects.StoreHomePage;

import java.io.IOException;
import java.time.Duration;

public class SignInPageTest extends BasePage {


    public SignInPageTest() throws IOException {
        super();
    }

    @Test
    public void enterHomePage() throws IOException {
        HomePage homePage=new HomePage();
        homePage.getTestStoreLink().click();
        waitForElementInvisible(homePage.getTestStoreLink(), Duration.ofSeconds(10));

        StoreHomePage storeHomePage=new StoreHomePage();
        storeHomePage.signInBtn().click();

        SignInPage signInPage=new SignInPage();
        signInPage.enterEmail().sendKeys("n.kumar9@outlook.com");
        signInPage.enterPassword().sendKeys("AaronCaleb2021#");
        signInPage.clickSignInBtn().click();



    }




}
