package locators;

import org.openqa.selenium.By;

public class LoginLocators {

    public static By loginButton = By.id("login2");
    public static By usernameField = By.id("loginusername");
    public static By passwordField = By.id("loginpassword");
    public static By loginSubmit = By.xpath("//button[text()='Log in']");
    public static By closeButton = By.xpath("//button[text()='Close']");
}