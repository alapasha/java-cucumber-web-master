package app.bersama.pages;

import app.bersama.Keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class NotificationPage {
    protected WebDriver webDriver;

    public NotificationPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "notification")
    private WebElement notificationButton;

    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[2]/div")
    private WebElement notificationList;

    public void clickNotificationButton() {
        Keyword.click(notificationButton);
    }

    public void verifyNotificationList() {
        Keyword.validateElementIsVisibleAndEnabled(notificationList);
    }

}
