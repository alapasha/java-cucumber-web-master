package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import app.bersama.pages.HomePage;
import app.bersama.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.random.RandomGenerator;

public class ProfileStep {

    @When("user navigate to profile page")
    public void user_navigate_to_profile_page() {
        HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());
        homePage.userProfile();
    }

    @Then("fillout profile information")
    public void fillout_profile_information(String string) {
        ProfilePage profilePage = new ProfilePage(DriverManager.getInstance().getDriver());
        profilePage.enterData("Mohammad Arya","Bandung", "0877700177005");
    }

    @Then("user successfully landed to profile page {string}")
    public void current_url_should_be(String url) {
        Keyword.assertCurrentUrl(url);

    }
}
