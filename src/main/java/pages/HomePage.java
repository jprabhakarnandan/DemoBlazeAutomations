package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By loginButton = By.id("login2");
    By phonesCategory = By.linkText("Phones");
    By laptopsCategory = By.linkText("Laptops");
    By cartLink = By.id("cartur");

    // Actions
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void clickPhones() {
        driver.findElement(phonesCategory).click();
    }

    public void clickLaptops() {
        driver.findElement(laptopsCategory).click();
    }

    public void clickCart() {
        driver.findElement(cartLink).click();
    }
}