package Pom.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HomePage  {

    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    //locators
    private By signupButton = By.xpath("//a[@href ='/login']");
    //Methods "Actions"
    public void clicksignupButton ()
    {
        driver.findElement(signupButton).click();
    }
}

