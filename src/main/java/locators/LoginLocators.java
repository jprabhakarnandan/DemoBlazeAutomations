package locators;

import org.openqa.selenium.By;

public class LoginLocators {

    public static final By LOGIN_LINK = By.id("login2");
    public static final By USERNAME = By.id("loginusername");
    public static final By PASSWORD = By.id("loginpassword");
    public static final By LOGIN_BUTTON = By.xpath("//button[text()='Log in']");
    public static final By LOGOUT = By.id("logout2");
}