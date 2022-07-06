package testcases;

import basepackage.DriverFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;

import java.io.IOException;
import java.time.Duration;


    public class AddRemoveItemBasketTest extends DriverFactory {
        public AddRemoveItemBasketTest() throws IOException {
        }

        @Test
        public void addRemoveItem() throws IOException {
            HomePage homePage = new HomePage();
            homePage.getTestStoreLink().click();
            StoreHomePage storeHomePage = new StoreHomePage();
            storeHomePage.getProdOne().click();
            StoreProductPage storeProductPage = new StoreProductPage();
            Select menuItem = new Select(storeProductPage.getSizeOption());
            menuItem.selectByVisibleText("M");
            storeProductPage.getQuantIncrease().click();
            storeProductPage.getAddToCartBtn().click();
            StoreContentPage storeContentPage = new StoreContentPage();
            storeContentPage.getContinueShopBtn().click();
            storeProductPage.getHomepageLink().click();
            storeHomePage.getProdTwo().click();
            storeProductPage.getAddToCartBtn().click();
            storeContentPage.getCheckoutBtn().click();
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
            shoppingCartPage.getDeleteItemTwo().click();
            waitForElementInvisible(shoppingCartPage.getDeleteItemTwo(), Duration.ofSeconds(10L));
            System.out.println(shoppingCartPage.getTotalAmount().getText());
            Assert.assertEquals(shoppingCartPage.getTotalAmount().getText(), "$45.24");
        }
    }

