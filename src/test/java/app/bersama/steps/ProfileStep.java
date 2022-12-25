package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.HomePage;
import app.bersama.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileStep {

    @When("user directed to profile page")
    public void user_directed_to_profile_page() {
        ProfilePage profilePage = new ProfilePage(DriverManager.getInstance().getDriver());
        profilePage.userProfile();
    }

    @Then("fillout profile information as {string}")
    public void fillout_profile_information_as(String string) {
        ProfilePage profilePage = new ProfilePage(DriverManager.getInstance().getDriver());
        String name = ProfilePage.
        String address = "Taman Yasmin Sector 3";
        String phoneNumber = "08130909091";
    }

    @Then("current url should be {string}")
    public void current_url_should_be(String string) {
    }
}
