package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

    @FindBy(xpath = "//*[@id=\"exampleInputEmail1\"]")
    private WebElement userNameField;

    @FindBy(xpath = "//*[@id=\"exampleInputPassword1 \"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li/a")
    private WebElement btnMasuk;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/button")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/p/a")
    private WebElement btnRegister;

    @FindBy (xpath = "//button[@id='user']")
    private WebElement btnUser;

    public void userLogin(String userName, String password) {
        Keyword.click(btnMasuk);
        Keyword.enterText(userNameField, userName);
        Keyword.enterText(passwordField, password);
        Keyword.click(btnLogin);
        Keyword.waitElementToBeDisplayed(btnUser);
    }


}
