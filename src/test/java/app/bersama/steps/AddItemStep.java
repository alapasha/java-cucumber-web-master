package app.bersama.steps;

import app.bersama.DriverManager;

import app.bersama.RandomGenerator;
import app.bersama.pages.ProductInfoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddItemStep {
    @When("Add new item")
    public void addNewItem() {
        ProductInfoPage productInfoPage = new ProductInfoPage(DriverManager.getInstance().getDriver());
        productInfoPage.addNewItem();
    }

    @Then("Fill the information form")
    public void fillTheInformationForm(String credentialType) {

        String productName = RandomGenerator.getRandomItemName();
        String productPrice = RandomGenerator.getRandomNumber(5);
        String productDescription = RandomGenerator.getRandomDescription();

        ProductInfoPage productInfoPage = new ProductInfoPage(DriverManager.getInstance().getDriver());
        productInfoPage.fillInformationForm(productName, productPrice, productDescription);

    }
}
