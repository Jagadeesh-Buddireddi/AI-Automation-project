package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObjects {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void userRegistration() throws InterruptedException {
        driver.manage().window().wait(3000);
        REGISTER_LINK.click();

    }
}
