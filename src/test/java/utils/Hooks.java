package utils;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setUp(Scenario scenario) {
        // Initialize WebDriver before each scenario
        driver = DriverFactory.getDriver();
        System.out.println("Starting scenario: " + scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        // Capture screenshot on failure and clean up
        if (scenario.isFailed()) {
            String screenshotPath = ScreenShotsUtil.captureScreenshot(driver, scenario.getName() + "_Failure");
            System.out.println("Scenario failed! Screenshot saved at: " + screenshotPath);
        }
        DriverFactory.quitDriver();
        System.out.println("Finished scenario: " + scenario.getName());
    }
}