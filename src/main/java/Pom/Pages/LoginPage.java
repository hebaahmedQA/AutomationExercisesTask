package Pom.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    //constructor
    public LoginPage (WebDriver driver)
    {

        this.driver = driver;
    }
    //Locators
    private  By nameField =  By.xpath("//input[@name ='name']");
    By emailField = By.xpath("//input[@data-qa = 'signup-email']");
    By signupButton = By.xpath("//button[@data-qa = 'signup-button']");

    // Actions
    public void signupClicking ()
    {
        driver.findElement(nameField).sendKeys("Heba");
        String currentTime = System.currentTimeMillis() + "@gmail.com";
        driver.findElement(emailField).sendKeys(currentTime);
        driver.findElement(signupButton).click();
    }
}
