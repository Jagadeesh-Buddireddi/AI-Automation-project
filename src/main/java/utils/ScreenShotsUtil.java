package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotsUtil {

    public WebDriver driver;

    public static String captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName + "_" + timestamp + ".png";
            File target = new File(destination);
            FileUtils.copyFile(source, target);
            return destination;
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
            return null;
        }
    }
}
