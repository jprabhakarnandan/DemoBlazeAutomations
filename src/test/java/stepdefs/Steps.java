package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

import java.time.Duration;

public class Steps {

    WebDriver driver;
    HomePage home;
    ProductPage product;
    CartPage cart;

    @Given("user opens Demoblaze website")
    public void openWebsite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        home = new HomePage(driver);
        product = new ProductPage(driver);
        cart = new CartPage(driver);

        home.openSite();
    }

    @When("user logs in")
    public void loginUser() {
        home.login("PrabhakarJha", "Qazwsx123");
        Assert.assertTrue(home.isUserLoggedIn(), "Login failed");
    }

    @And("user selects a phone")
    public void selectPhone() {
        Assert.assertTrue(home.isUserLoggedIn(), "User not logged in");

        product.selectSamsungGalaxy();

        Assert.assertTrue(product.isProductPageOpened(),
                "Product page not opened");
    }

    @And("user adds product to cart")
    public void addToCart() {
        product.addToCart();
    }

    @And("user goes to cart")
    public void goToCart() {
        cart.goToCart();
    }

    @And("user places the order")
    public void placeOrder() {
        cart.placeOrder();
    }

    @Then("order should be placed successfully")
    public void verifyOrder() {
        Assert.assertTrue(cart.isOrderPlaced(),
                "Order not placed");
        driver.quit();
    }
}