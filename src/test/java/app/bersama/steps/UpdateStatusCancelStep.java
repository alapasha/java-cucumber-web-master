package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.InfoPenawarPage;
import io.cucumber.java.en.Then;

public class UpdateStatusCancelStep {
    @Then("seller update status cancel transaction")
    public void sellerUpdateStatusCancelTransaction() {
        InfoPenawarPage infoPenawarPage = new InfoPenawarPage(DriverManager.getInstance().getDriver());
        infoPenawarPage.updateCancelStatus();
    }
}
