package app.bersama.steps;

import app.bersama.DriverManager;

import app.bersama.Keyword;
import app.bersama.RandomGenerator;
import app.bersama.pages.HomePage;
import app.bersama.pages.ProductInfoPage;
import app.bersama.pages.SellListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddItemStep {
    @When("Add new item")
    public void addNewItem() {
        ProductInfoPage productInfoPage = new ProductInfoPage(DriverManager.getInstance().getDriver());
        productInfoPage.addNewItem();
    }

    @Then("Fill the information form")
    public void fillTheInformationForm() {

        String productName = RandomGenerator.getRandomItemName();
        String productPrice = RandomGenerator.getRandomNumber(5);
        String productDescription = RandomGenerator.getRandomDescription();

        ProductInfoPage productInfoPage = new ProductInfoPage(DriverManager.getInstance().getDriver());
        productInfoPage.fillInformationForm(productName, productPrice, productDescription);

    }


    @When("user click my sell list button")
    public void userClickMySellListButton() {

        HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());
        homePage.setNavLinkSellList();

    }

    @Then("user could verify their list of product")
    public void userCouldVerifyTheirListOfProduct() {

        SellListPage sellListPage = new SellListPage(DriverManager.getInstance().getDriver());
        sellListPage.stringDaftarJual();

    }
}
