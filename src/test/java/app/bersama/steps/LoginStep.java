package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import app.bersama.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    @When("login as invalid_user {string}")
    public void login_as_invalid_user(String string) {
        String userEmail = "invaliduser@gmail.com";
        String password = "aaaa";

        LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
        loginPage.userLogin(userEmail, password);
    }
    @When("user landed to login page {string}")
    public void currentUrlShouldBe(String url) {
        Keyword.assertCurrentUrl(url);
    }

    @Then("user verify error message with value {string}")
    public void userVerifyErrorMessageWithValue(String message) {
        new LoginPage(DriverManager.getInstance().getDriver()).
                verifyErrorMessage(message);
    }
}

