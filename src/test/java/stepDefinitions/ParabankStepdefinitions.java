package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ParabankStepdefinitions extends ParabankStepdefinitionsSub {

    public ParabankStepdefinitions(WebDriver driver) {
        super(driver);
    }

    @Given("User is on the homepage of parabank application")
    public void userIsOnTheHomepageOfParabankApplication() {
        navigateToHomepage();

    }

    @When("the user registers new account")
    public void theUserRegistersNewAccount() throws InterruptedException {
        registerAccount();
    }

//    @Then("the user logs in with new credentials")
//    public void theUserLogsInWithNewCredentials() {
//    }
}
