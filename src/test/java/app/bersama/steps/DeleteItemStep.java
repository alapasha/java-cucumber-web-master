package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.SellListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DeleteItemStep {
    @When("delete product")
    public void deleteProduct() {

        SellListPage sellListPage = new SellListPage(DriverManager.getInstance().getDriver());
        sellListPage.deleteItem();

    }

    @Then("user return to homepage")
    public void userReturnToHomepage() {

        SellListPage sellListPage = new SellListPage(DriverManager.getInstance().getDriver());
        sellListPage.verifyHomeBanner();

    }
}
