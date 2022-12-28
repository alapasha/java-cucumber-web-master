package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.LoginPage;
import app.bersama.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {
    @When("click button daftar disini")
    public void click_button_daftar_disini() {
        RegisterPage registerPage = new RegisterPage(DriverManager.getInstance().getDriver());
        registerPage.clickButton_daftardisini();
    }

    @When("regist as new account")
    public void regist_as_new_account() {
        RegisterPage registerPage = new RegisterPage(DriverManager.getInstance().getDriver());
        registerPage.userRegist("hani","hani@gmail.com","hanifah123");
    }

    @Then("user get alert message verification email")
    public void user_get_alert_message_verification_email() {
        RegisterPage registerPage = new RegisterPage(DriverManager.getInstance().getDriver());
        registerPage.verificationMessage();
    }
}
