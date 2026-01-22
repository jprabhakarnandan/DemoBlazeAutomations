package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By placeOrderButton = By.xpath("//button[text()='Place Order']");
    By nameField = By.id("name");
    By countryField = By.id("country");
    By cityField = By.id("city");
    By cardField = By.id("card");
    By monthField = By.id("month");
    By yearField = By.id("year");
    By purchaseButton = By.xpath("//button[text()='Purchase']");
    By confirmation = By.xpath("//h2[text()='Thank you for your purchase!']");

    public void clickPlaceOrder() {
        driver.findElement(placeOrderButton).click();
    }

    public void fillOrderForm() {
        driver.findElement(nameField).sendKeys("Prabhakar Jha");
        driver.findElement(countryField).sendKeys("India");
        driver.findElement(cityField).sendKeys("Kolkata");
        driver.findElement(cardField).sendKeys("12345678");
        driver.findElement(monthField).sendKeys("01");
        driver.findElement(yearField).sendKeys("2026");
    }

    public void clickPurchase() {
        driver.findElement(purchaseButton).click();
    }

    public boolean isOrderPlaced() {
        return driver.findElement(confirmation).isDisplayed();
    }
}