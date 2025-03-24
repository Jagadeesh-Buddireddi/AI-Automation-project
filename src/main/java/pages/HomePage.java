package pages;

import config.ConfigReader;
import driver.DriverFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import utils.ScreenShotsUtil;

import java.time.Duration;


@Slf4j
public class HomePage {

    public WebDriver driver;

    public HomePage() {
        this.driver = DriverFactory.getDriver();
    }

    public void navigateToUrl() {
        String url = ConfigReader.getProperty("URL");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        String pageTitle = driver.getTitle();
        ScreenShotsUtil.captureScreenshot(driver, "HomePage");
        log.info("User navigated to {}", pageTitle);
    }


}
