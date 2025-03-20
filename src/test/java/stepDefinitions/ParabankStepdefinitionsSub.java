package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class ParabankStepdefinitionsSub {

    public WebDriver driver;
    public HomePage homePage;

    public ParabankStepdefinitionsSub(WebDriver driver){
        this.driver = driver;
    }


    @Test
    public void navigateToHomepage(){
        homePage.navigateToUrl();
    }


}
