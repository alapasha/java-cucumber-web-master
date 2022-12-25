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
        Keyword.navigateToUrl(url); }

    @When("login as {string}")
    public void login_as(String string) {
        LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
        loginPage.enterCredential("raushanfiqriarya@gmail.com", "Password*1");
        loginPage.tapButtonLogin();
    }

    @Then("current url should be {string}")
    public void current_url_should_be(String expectedUrl) {
        Keyword.assertCurrentUrl(expectedUrl);
    }

}
