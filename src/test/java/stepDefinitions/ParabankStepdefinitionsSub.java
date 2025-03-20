package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class ParabankStepdefinitionsSub {

    public WebDriver driver;
    public static HomePage homePage;
    public static LoginPage loginPage;

    public ParabankStepdefinitionsSub(WebDriver driver){
        this.driver = driver;
    }


    @Test
    public void navigateToHomepage(){
        homePage.navigateToUrl();
    }

    public void registerAccount() throws InterruptedException {
        loginPage.userRegistration();
    }


}
