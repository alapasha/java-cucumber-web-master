package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.DaftarJualPage;
import app.bersama.pages.InfoPenawarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcceptBidPriceStep {

    @Given("seller direct to daftar jual page")
    public void seller_direct_to_daftar_jual_page() {
        DaftarJualPage daftarJualPage = new DaftarJualPage(DriverManager.getInstance().getDriver());
        daftarJualPage.updateProductOffer();
    }
    @When("seller accepted the bid price")
    public void seller_accepted_the_bid_price() {
        InfoPenawarPage infoPenawarPage = new InfoPenawarPage(DriverManager.getInstance().getDriver());
        infoPenawarPage.acceptOfferPrice();
    }
    @Then("seller get allert message")
    public void seller_get_allert_message() {
        InfoPenawarPage infoPenawarPage = new InfoPenawarPage(DriverManager.getInstance().getDriver());
        infoPenawarPage.verifyAllertSuccess();
    }
}
