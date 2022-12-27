package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;
import java.time.Duration;

public class DaftarJualPage {
    protected WebDriver webDriver;

    public DaftarJualPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[1]/a")
    private WebElement navBar_DaftarJual;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[1]/div/div/div/button[2]")
    private WebElement button_Diminati;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div/div/div")
    private WebElement choose_product;

    public void updateProductOffer(){
        Keyword.click(navBar_DaftarJual);
        Keyword.click(button_Diminati);
        Keyword.click(choose_product);
    }
}
