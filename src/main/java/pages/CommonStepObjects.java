package pages;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CommonStepObjects {

    public WebDriver driver;

    public CommonStepObjects() {
        this.driver = DriverFactory.getDriver();
    }

    public static HomePage homePage = new HomePage();
}
