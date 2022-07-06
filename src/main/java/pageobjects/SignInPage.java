package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static basepackage.BasePage.getDriver;

public class SignInPage {
    public static WebDriver driver;

    public SignInPage() {
        super();

    }


    By enterEmail = By.xpath("//input[@name='email']");

    By enterPassword = By.xpath("//input[@name='password']");

    By signBtn=By.cssSelector("button#submit-login");


    public WebElement enterEmail() throws IOException {
        this.driver = getDriver();
        return driver.findElement(enterEmail);

    }

    public WebElement enterPassword() throws IOException {
        this.driver = getDriver();
        return driver.findElement(enterPassword);

    }

    public WebElement clickSignInBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(signBtn);

    }
}
