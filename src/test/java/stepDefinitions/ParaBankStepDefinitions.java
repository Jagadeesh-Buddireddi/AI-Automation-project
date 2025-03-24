package stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepDefinitions.ParabankStepdefinitionsSub;

public class ParaBankStepDefinitions extends ParabankStepdefinitionsSub {

    public ParaBankStepDefinitions() {
        super();
        this.driver = DriverFactory.getDriver();
    }

    @Given("The user is on the homepage of parabank application")
    public void theUserIsOnTheHomepageOfParabankApplication() {
        navigateToHomepage();
    }

    @When("The user registers new account")
    public void theUserRegistersNewAccount() {
        registerAccount();
    }

    @Then("the user logs in with new credentials")
    public void theUserLogsInWithNewCredentials() {
        delete();
    }
}
