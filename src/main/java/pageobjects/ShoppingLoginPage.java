package pageobjects;


import basepackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShoppingLoginPage extends BasePage {

    public WebDriver driver;

    By email = By.cssSelector("section input[name='email']");
    By password = By.cssSelector("input[name='password']");
    By signBtn=By.cssSelector("button#submit-login");


    public ShoppingLoginPage() throws IOException {
        super();
    }

    public WebElement getEmail() throws IOException {
        this.driver=getDriver();
        return driver.findElement(email);
    }
    public WebElement getPassword() throws IOException {
        this.driver=getDriver();
        return driver.findElement(password);
    }
    public WebElement getSignInBtn() throws IOException {
        this.driver=getDriver();
        return driver.findElement(signBtn);
    }

}

