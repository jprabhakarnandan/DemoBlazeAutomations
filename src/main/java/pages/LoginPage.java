package pages;

import locators.LoginLocators;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(LoginLocators.loginButton).click();
    }

    public void enterUsername(String username) {
        driver.findElement(LoginLocators.usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginLocators.passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LoginLocators.loginSubmit).click();
    }

    public void closePopup() {
        driver.findElement(LoginLocators.closeButton).click();
    }
}