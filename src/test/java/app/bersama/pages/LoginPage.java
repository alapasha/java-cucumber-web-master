package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.security.Key;
import java.time.Duration;

/**
 * @author regiewby on 02/12/22
 * @project java-cucumber-learning
 */
public class LoginPage {

    protected WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "exampleInputEmail1")
    private WebElement inputEmail;

    @FindBy(xpath = "//*[@id=\"exampleInputPassword1 \"]")
    private  WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/button")
    private WebElement button_login;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div[1]/p")
    private WebElement ErrorMessage;

    public void userLogin(String userEmail, String password) {
        Keyword.enterText(inputEmail, userEmail);
        Keyword.enterText(inputPassword, password);
        Keyword.click(button_login);
    }

    public void verifyErrorMessage(String expectedMessage) {
        String actual = ErrorMessage.getText();
        Assert.assertEquals(actual, expectedMessage);
    }

}