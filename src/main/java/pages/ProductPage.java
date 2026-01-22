package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By firstPhone = By.xpath("(//a[@class='hrefch'])[1]");
    By addToCartButton = By.linkText("Add to cart");

    // Actions
    public void selectFirstProduct() {
        driver.findElement(firstPhone).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}