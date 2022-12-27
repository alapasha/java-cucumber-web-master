package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class BuyProductPage {
    protected WebDriver webDriver;

    public BuyProductPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[5]")
    private WebElement click_product;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div/div/button")
    private WebElement button_interest;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[2]/input")
    private WebElement entry_BidPrice;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button")
    private WebElement button_send;

    //message "Harga tawarmu berhasil dikirim ke penjual"
    @FindBy(xpath = "/html/body/div/div/div/div[2]")
    private WebElement allert_success;

    public void clickProduct(){
        Keyword.click(click_product);
    }
    public void clickInterest(){
        Keyword.click(button_interest);
    }

    public void enterPrice(String price){
        Keyword.enterText(entry_BidPrice,price);
    }
    public void clickSend(){
        Keyword.click(button_send);
    }

    public void verifySuccessBid(){
        Keyword.validateElementIsVisibleAndEnabled(allert_success);
    }
}
