package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import app.bersama.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author regiewby on 05/12/22
 * @project java-cucumber-learning
 */
public class CommonStep {

    @Given("navigate to url {string}")
    public void navigate_to_url(String url) {
        Keyword.navigateToUrl(url);
    }

    @When("login as {string}")
    public void login_as(String login_credential) {
        String userName = "";
        String password = "";

        switch (login_credential) {
            case "valid_credential":
                userName = "binarqae1@gmail.com";
                password = "students1234";
                break;

            case "invalid_user":
                userName = "invalid_user@gmail.com";
                password = "wrong_password";
                break;

            default:
                throw new RuntimeException("credential type doesn't exist");
        }

        LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
        loginPage.userLogin(userName, password);


    }

    @Then("current url should be {string}")
    public void current_url_should_be(String expectedUrl) {
        Keyword.assertCurrentUrl(expectedUrl);
    }

}
