package stepDefinitions;

import config.ConfigReader;
import driver.DriverFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.CommonStepObjects;
import pages.HomePage;
import pages.LoginPage;
import utils.ScreenShotsUtil;

import java.time.Duration;

@Slf4j
public class ParabankStepdefinitionsSub extends CommonStepObjects {


    public WebDriver driver;
    public static LoginPage loginPage;

    public ParabankStepdefinitionsSub() {
        this.driver = DriverFactory.getDriver();
    }



    @Test
    public void navigateToHomepage() {
        homePage.navigateToUrl();
    }

    public void registerAccount(){
        log.info("Account Registered");
    }

    public void delete(){
        log.info("delete");
    }
}

