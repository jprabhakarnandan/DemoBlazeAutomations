package locators;

import org.openqa.selenium.By;

public class CartLocators {

    public static final By PLACE_ORDER = By.xpath("//button[text()='Place Order']");
    public static final By NAME = By.id("name");
    public static final By COUNTRY = By.id("country");
    public static final By CITY = By.id("city");
    public static final By CARD = By.id("card");
    public static final By MONTH = By.id("month");
    public static final By YEAR = By.id("year");
    public static final By PURCHASE = By.xpath("//button[text()='Purchase']");
    public static final By SUCCESS = By.xpath("//h2[contains(text(),'Thank you')]");
}