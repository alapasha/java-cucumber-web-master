package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import app.bersama.pages.BuyProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyProductStep {


        @Given("user want to buy product")
        public void user_want_to_buy_product() {
                BuyProductPage buyProductPage = new BuyProductPage(DriverManager.getInstance().getDriver());
                buyProductPage.clickProduct();
        }

        @When("user click interested and nego button")
        public void user_click_interested_and_nego_button() {
                BuyProductPage buyProductPage = new BuyProductPage(DriverManager.getInstance().getDriver());
                buyProductPage.clickInterest();
                buyProductPage.enterPrice("15000");
                buyProductPage.clickSend();
        }

        @Then("pop up message should be appear")
        public void pop_up_message_should_be_appear() {
                BuyProductPage buyProductPage = new BuyProductPage(DriverManager.getInstance().getDriver());
                buyProductPage.verifySuccessBid();
        }
}
