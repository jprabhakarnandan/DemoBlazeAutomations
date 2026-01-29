package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    By cartLink = By.id("cartur");
    By placeOrderBtn = By.xpath("//button[text()='Place Order']");

    By name = By.id("name");
    By country = By.id("country");
    By city = By.id("city");
    By card = By.id("card");
    By month = By.id("month");
    By year = By.id("year");

    By purchaseBtn = By.xpath("//button[text()='Purchase']");
    By successMsg = By.xpath("//h2[text()='Thank you for your purchase!']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goToCart() {
        driver.findElement(cartLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderBtn));
    }

    public void placeOrder() {

        driver.findElement(placeOrderBtn).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(name));

        driver.findElement(name).sendKeys("Prabhakar");
        driver.findElement(country).sendKeys("India");
        driver.findElement(city).sendKeys("Delhi");
        driver.findElement(card).sendKeys("1234567890");
        driver.findElement(month).sendKeys("12");
        driver.findElement(year).sendKeys("2026");

        driver.findElement(purchaseBtn).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
    }

    public boolean isOrderPlaced() {
        return driver.findElement(successMsg).isDisplayed();
    }
}