package Pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AccountCreatedPage {
    private WebDriver driver;

    // Constructor
    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }
    //locator
    private By accountCreatedText = By.xpath("//h2[contains(@class, 'title text-center')]");
    //actions
    public void verifyAccountCreated ()
    {
        Assert.assertEquals("ACCOUNT CREATED!", driver.findElement(accountCreatedText).getText());
    }
}
