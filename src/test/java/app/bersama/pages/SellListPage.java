package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;



public class SellListPage {

    protected WebDriver webDriver;

    public SellListPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[2]/div/div[3]")
    private WebElement item1;

    @FindBy(xpath = "/html/body/div/div/div/div/div[3]/div[1]/div/div/button[1]")
    private WebElement buttonDelete;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div/div/a")
    private WebElement buttonAddNewItem;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/h4")
    private WebElement stringDaftarJual;

    @FindBy(xpath = "/html/body/div/div/div/div/div[3]/div[1]/div/div/button[2]")
    private WebElement editButton;

    @FindBy(id = "banner")
    private WebElement homeBanner;

    public void deleteItem(){
        Keyword.click(item1);
        Keyword.validateElementIsVisibleAndEnabled(editButton);
        Keyword.click(buttonDelete);
    }

    public void stringDaftarJual(){
        Keyword.validateElementIsVisibleAndEnabled(stringDaftarJual);
    }

    public void verifyHomeBanner() {
        Keyword.waitElementToBeDisplayed(homeBanner);
    }

}
