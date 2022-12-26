package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class InfoPenawarPage {

    protected WebDriver webDriver;

    public InfoPenawarPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div[2]/div/button[2]")
    private WebElement button_accept;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div[2]/div[2]/div/button[1]")
    private WebElement button_reject;

    //after button reject
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/button[1]")
    private WebElement button_yes;

    //after button reject
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/button[2]")
    private WebElement button_no;

    //allert status "Tawaran produk diterima"
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]")
    private WebElement message_accepted;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/button[1]")
    private WebElement button_status;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[1]/input")
    private WebElement thick_berhasilTerjaul;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[2]/input")
    private WebElement thick_batalkanTransaksi;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button")
    private WebElement button_kirim;

    //allert success Status produk berhasil diperbarui
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]")
    private WebElement message_success;

    public void acceptOfferPrice(){
        Keyword.click(button_accept);
    }

    public void verifyAlertSuccess(){
        Keyword.validateElementIsVisibleAndEnabled(message_accepted);
    }
}
