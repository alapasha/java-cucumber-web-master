package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.SellListPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DeleteItemStep {
    @When("delete product")
    public void deleteProduct() {

        SellListPage sellListPage = new SellListPage(DriverManager.getInstance().getDriver());
        sellListPage.deleteItem();

    }
}
