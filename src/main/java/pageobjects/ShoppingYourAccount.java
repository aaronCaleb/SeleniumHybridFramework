package pageobjects;


import basepackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShoppingYourAccount extends BasePage {

    public WebDriver driver;

    By heading = By.cssSelector("h1");
    By signOut=By.cssSelector(".hidden-sm-down.logout");



    public ShoppingYourAccount() throws IOException {
        super();
    }

    public WebElement getHeading() throws IOException {
        this.driver=getDriver();
        return driver.findElement(heading);
    }

    public WebElement getSignOutBtn() throws IOException {
        this.driver=getDriver();
        return driver.findElement(signOut);
    }


}

