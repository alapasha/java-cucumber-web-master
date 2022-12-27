package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.DaftarJualPage;
import app.bersama.pages.InfoPenawarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeclineBidPrice {
    @When("seller decline bid price")
    public void sellerDeclineBidPrice() {
        InfoPenawarPage infoPenawarPage = new InfoPenawarPage(DriverManager.getInstance().getDriver());
        infoPenawarPage.declineOfferPrice();
    }

    @Then("seller get allert decline message")
    public void sellerGetAllertDeclineMessage() {
        InfoPenawarPage infoPenawarPage = new InfoPenawarPage(DriverManager.getInstance().getDriver());
        infoPenawarPage.verifyAllertDecline();
    }
}
