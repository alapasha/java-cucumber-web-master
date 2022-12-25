package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import app.bersama.pages.HomePage;
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
    public void navigateToUrl(String url) {
        Keyword.navigateToUrl(url);
    }

    @When("login as {string}")
    public void loginAs(String string) {
        String userEmail = "binarqae1@gmail.com";
        String password = "students1234";

        LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
        loginPage.userLogin(userEmail, password);
    }

    @Then("current url should be {string}")
    public void currentUrlShouldBe(String url) {
        Keyword.assertCurrentUrl(url);
    }

    @Then("user logout")
    public void user_logout() {
        HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());
        homePage.userLogout();
    }
}