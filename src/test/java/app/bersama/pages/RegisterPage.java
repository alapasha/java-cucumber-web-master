package app.bersama.pages;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class RegisterPage {

    protected WebDriver webDriver;

    public RegisterPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[2]/form/div[1]/input")
    private WebElement inputNama;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/form/div[2]/input")
    private WebElement inputEmail;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/form/div[3]/input")
    private  WebElement inputPassword;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/form/button")
    private WebElement button_daftar;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/form/p/a")
    private WebElement button_daftardisini;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/form/div[1]")
    private WebElement verificationMessage;


    public void userRegist(String userNama, String userEmail, String password) {
        Keyword.enterText(inputNama, userNama);
        Keyword.enterText(inputEmail, userEmail);
        Keyword.enterText(inputPassword, password);
        Keyword.click(button_daftar);
    }

    public void clickButton_daftardisini(){
        Keyword.click(button_daftardisini);
    }

    public void verificationMessage(){
        Keyword.validateElementIsVisibleAndEnabled(verificationMessage);
    }

}
