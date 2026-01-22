package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() throws InterruptedException {

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);

        // Click Login
        home.clickLogin();
        Thread.sleep(2000);

        // Enter credentials (your real user)
        login.enterUsername("PrabhakarJha");
        login.enterPassword("Qazwsx123");
        login.clickLoginButton();

        Thread.sleep(3000);

        // Validate login success
        boolean isLoggedIn = driver.getPageSource().contains("Log out");
        Assert.assertTrue(isLoggedIn, "Login failed!");
    }
}