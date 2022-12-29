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

    @FindBy(id = "navbarText")
    private WebElement navLinkLogin;


    //Profile & Logout
    @FindBy(id = "user")
    private WebElement button_user;

    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[3]/div/a")
    private WebElement button_profile;

    @FindBy(xpath = "/html/body/div/div/nav/div/div/div/ul/li[3]/div/button")
    private WebElement button_logout;

    @FindBy(xpath = "/html/body/div/div/nav/div/div/div/ul/li[1]/a")
    private WebElement navLinkSellList;

    public void userProfile() {

        Keyword.click(button_user);
        Keyword.click(button_profile);
    }

    public void userLogout() {

        Keyword.click(button_user);
        Keyword.click(button_logout);
    }

    public void setNavLinkSellList() {
        Keyword.click(navLinkSellList);
    }

    public void clickNavlinkLogin() {Keyword.click((navLinkLogin));}
}
