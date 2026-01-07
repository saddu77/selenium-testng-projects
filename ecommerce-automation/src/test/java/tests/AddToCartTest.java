package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCart() {
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.login("standard_user", "secret_sauce");
        home.addProductToCart();
        home.openCart();

        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
    }
}
