package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static app.bersama.pages.HomePage.navLinkJual;

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

    @FindBy(id = "kategori")
    private WebElement chooseProductCategory;

    @FindBy(id = "deskripsi")
    private WebElement inputProductDescription;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/form/div[6]/div[2]/button")
    private WebElement buttonPublish;

    public void addNewItem(){
        Keyword.click(navLinkJual);
    }

    public void fillInformationForm(String productName, String productPrice, String productDescription) {
        Keyword.enterText(inputProductName, productName);
        Keyword.enterText(inputProductPrice, productPrice);
        Keyword.click(chooseProductCategory);
        Keyword.enterText(inputProductDescription, productDescription);
    }
}
