package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By loginLink = By.id("login2");
    By usernameInput = By.id("loginusername");
    By passwordInput = By.id("loginpassword");
    By loginBtn = By.xpath("//button[text()='Log in']");
    By logoutLink = By.id("logout2");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openSite() {
        driver.get("https://www.demoblaze.com/");
    }

    public void login(String username, String password) {

        driver.findElement(loginLink).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput));

        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(username);

        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);

        driver.findElement(loginBtn).click();

        // wait till logout visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink));
    }

    public boolean isUserLoggedIn() {
        return driver.findElement(logoutLink).isDisplayed();
    }
}