import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Slf4j
public class Hooks {

    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver.manage().window().maximize();
        log.info("Browser initialized");

    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            log.info("Browser has been closed");
        }

    }
}
