package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import driver.DriverFactory;

public class TestListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = DriverFactory.getDriver();
        if (driver != null) {
            String testName = result.getMethod().getMethodName();
            ScreenShotsUtil.captureScreenshot(driver, testName + "_Failure");
            System.out.println("AI Analysis: " + AIFailureAnalyzer.analyzeFailure(result));
        }
    }
}