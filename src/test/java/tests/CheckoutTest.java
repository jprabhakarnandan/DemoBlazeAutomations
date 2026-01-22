package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void placeOrderTest() throws InterruptedException {

        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);

        // Select product
        home.clickPhones();
        Thread.sleep(2000);
        product.selectFirstProduct();
        Thread.sleep(2000);
        product.addToCart();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        // Go to cart
        home.clickCart();
        Thread.sleep(2000);

        // Place order
        cart.clickPlaceOrder();
        Thread.sleep(2000);
        cart.fillOrderForm();
        cart.clickPurchase();
        Thread.sleep(3000);

        Assert.assertTrue(cart.isOrderPlaced(), "Order was not placed successfully");
    }
}