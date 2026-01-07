package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.*;

public class CheckoutTest extends BaseTest {

    @Test
    public void verifyCompleteCheckout() {

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        OverviewPage overview = new OverviewPage(driver);

        login.login("standard_user", "secret_sauce");
        home.addProductToCart();
        home.openCart();
        cart.clickCheckout();
        checkout.enterDetails("John", "Doe", "500001");
        overview.finishOrder();

        Assert.assertEquals(
            overview.getConfirmationMessage(),
            "Thank you for your order!"
        );
    }
}
