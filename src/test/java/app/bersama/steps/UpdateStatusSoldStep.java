package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.InfoPenawarPage;
import io.cucumber.java.en.Then;

public class UpdateStatusSoldStep {
    @Then("seller update status sold product")
    public void sellerUpdateStatusSoldProduct() {
        InfoPenawarPage infoPenawarPage = new InfoPenawarPage(DriverManager.getInstance().getDriver());
        infoPenawarPage.updateSoldStatus();
    }

    @Then("seller get allert success updated status product")
    public void seller_get_allert_success_updated_status_product() {
        InfoPenawarPage infoPenawarPage = new InfoPenawarPage(DriverManager.getInstance().getDriver());
        infoPenawarPage.verifyAllertUpdateStatusSold();
    }
}
