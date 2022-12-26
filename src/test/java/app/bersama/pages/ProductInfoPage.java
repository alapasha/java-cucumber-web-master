package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class ProductInfoPage {
    protected WebDriver webDriver;

    public ProductInfoPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "nm_produk")
    private WebElement inputProductName;

    @FindBy(id = "harga_produk")
    private WebElement inputProductPrice;

    @FindBy(xpath = "//*[@id=\"kategori\"]/option[2]")
    private WebElement chooseProductCategory;

    @FindBy(id = "deskripsi")
    private WebElement inputProductDescription;

    @FindBy(xpath = "/html/body/div/div/div/div/form/div[6]/div[2]/button")
    private WebElement buttonPublish;

    @FindBy(xpath = "/html/body/div/div/a")
    private  WebElement navLinkJual;

    public void addNewItem(){
        Keyword.waitElementToBeDisplayed(navLinkJual);
        Keyword.click(navLinkJual);
    }

    public void fillInformationForm(String productName, String productPrice, String productDescription) {
        Keyword.enterText(inputProductName, productName);
        Keyword.enterText(inputProductPrice, productPrice);
        Keyword.click(chooseProductCategory);
        Keyword.enterText(inputProductDescription, productDescription);
        Keyword.click(buttonPublish);
    }
}
