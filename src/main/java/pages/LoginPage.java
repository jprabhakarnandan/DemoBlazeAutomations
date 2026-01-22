package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By usernameField = By.id("loginusername");
    By passwordField = By.id("loginpassword");
    By loginButton = By.xpath("//button[text()='Log in']");
    By closeButton = By.xpath("//button[text()='Close']");

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void closeLoginPopup() {
        driver.findElement(closeButton).click();
    }
}