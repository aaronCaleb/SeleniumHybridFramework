package pageobjects;

import basepackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class StoreProductPage extends BasePage {
    public static WebDriver driver;

    public StoreProductPage() throws IOException {
        super();
    }

    By sizeOption = By.cssSelector("[data-product-attribute='1']");
    By quantityIncrease = By.cssSelector(".touchspin-up");
    By quantityDecrease = By.cssSelector(".touchspin-down");
    By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
    By homepageLink = By.xpath("//span[.='Home']");


    public WebElement getSizeOption() throws IOException {
        this.driver=getDriver();
        return driver.findElement(sizeOption);
    }

    public WebElement getQuantIncrease() throws IOException {
        this.driver=getDriver();
        return driver.findElement(quantityIncrease);
    }

    public WebElement getQuantDecrease() throws IOException {
        this.driver=getDriver();
        return driver.findElement(quantityDecrease);
    }

    public WebElement getAddToCartBtn() throws IOException {
        this.driver=getDriver();
        return driver.findElement(addToCartBtn);
    }

    public WebElement getHomepageLink() throws IOException {
        this.driver=getDriver();
        return driver.findElement(homepageLink);
    }

}
