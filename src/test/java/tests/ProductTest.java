package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void addProductToCartTest() throws InterruptedException {

        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);

        home.clickPhones();
        Thread.sleep(2000);

        product.selectFirstProduct();
        Thread.sleep(2000);

        product.addToCart();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        boolean isAdded = driver.getPageSource().contains("Cart");
        Assert.assertTrue(isAdded, "Product not added to cart");
    }
}