package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage {
    protected WebDriver webDriver;

    public HomePage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "//*[@id=\"navbarText\"]/ul/li/a")
    private WebElement navLinkLogin;


    //Profile & Logout
    @FindBy(xpath = "//*[@id=\"user\"]")
    private WebElement button_user;

    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[3]/div/a")
    private WebElement button_profile;

    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[3]/div/button")
    private WebElement button_logout;

    public void userProfile() {
        Keyword.click(button_user);
        Keyword.click(button_profile);
        Keyword.click(button_logout);
    }
}