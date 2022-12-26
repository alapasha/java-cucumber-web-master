package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.NotificationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotificationStep {
    @When("user click notification button on homepage")
    public void userClickNotificationButtonOnHomepage() {

        NotificationPage notificationPage = new NotificationPage(DriverManager.getInstance().getDriver());
        notificationPage.clickNotificationButton();

    }

    @Then("user could verify the notification list")
    public void userCouldVerifyTheNotificationList() {

        NotificationPage notificationPage = new NotificationPage(DriverManager.getInstance().getDriver());
        notificationPage.verifyNotificationList();

    }
}
