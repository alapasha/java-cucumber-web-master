package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;
import java.time.Duration;

public class ProfilePage {

    protected WebDriver webDriver;

    public ProfilePage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (id = "nm_produk")
    private WebElement input_name;

    @FindBy (id = "kota")
    private WebElement option_city;

    @FindBy (id = "deskripsi")
    private WebElement input_address;

    @FindBy (id = "nm_produk")
    private WebElement input_phoneNumber;

    @FindBy (xpath = "/html/body/div/div/div/div[2]/form/div[5]/div/button")
    private WebElement button_submit;

    public void enterData(String name, String address, String phoneNumber){
        input_name.sendKeys(name);
        Keyword.click(option_city);
        input_address.sendKeys(address);
        input_phoneNumber.sendKeys(phoneNumber);
        Keyword.click(button_submit);

    }

}
