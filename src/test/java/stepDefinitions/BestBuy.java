package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class BestBuy {


    // 11 -110 Selcuk Bey  110-210 Hatem Bey   210-310 Ercan Bey     Satirlar arasi
    @Given("Naviate to the URL")
    public void naviateToTheURL() {
        Driver.getDriver().get(ConfigReader.getProperty("bestsUrl"));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {

    }

    @And("Click on {string} button")
    public void clickOnAccountButton() {
    }

    @And("Verify {string} is visible and click")
    public void verifyCreateAccountIsVisibleAndClick() {
    }

    @And("Enter First Name, LastNAme, Email, Password, Confirm Password, Click Crate an Account")
    public void enterFirstNameLastNAmeEmailPasswordConfirmPasswordClickCrateAnAccount() {
    }

    @And("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible() {
    }
}






