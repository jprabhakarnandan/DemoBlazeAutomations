package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By samsungGalaxy = By.linkText("Samsung galaxy s6");
    By addToCartBtn = By.linkText("Add to cart");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectSamsungGalaxy() {
        driver.findElement(samsungGalaxy).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartBtn));
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public boolean isProductPageOpened() {
        return driver.findElement(addToCartBtn).isDisplayed();
    }
}