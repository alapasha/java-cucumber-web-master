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

    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li/a")
    private WebElement navLinkLogin;

    public void setNavLinkLogin() {
        Keyword.click(navLinkLogin);
    }

    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[1]/a")
    private WebElement navLinkSellList;

    public void setNavLinkSellList() {
        Keyword.click(navLinkSellList);
    }
}
