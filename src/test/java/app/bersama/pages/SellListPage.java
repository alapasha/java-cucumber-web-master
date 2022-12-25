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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div/div[2]/div/div[1]")
    private WebElement item1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div/div/button[1]")
    private WebElement buttonDelete;

    public void deleteItem(){
        Keyword.click(item1);
        Keyword.click(buttonDelete);
    }
}
