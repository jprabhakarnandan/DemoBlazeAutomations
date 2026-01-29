package stepdefs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.ExtentManager;

public class Hooks {

    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    @Before
    public void setup(Scenario scenario) {

        extent = ExtentManager.getExtent();
        test = extent.createTest(scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            test.fail("Scenario Failed");
        } else {
            test.pass("Scenario Passed");
        }

        extent.flush();
    }
}