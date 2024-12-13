package Pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage {
    private WebDriver driver;

    //constructor
    public RegisterationPage(WebDriver driver)
    {

        this.driver = driver;
    }

    //locators
    By genderField = By.id("id_gender1");
    By passwordField = By.id("password");
    By dayDropDown = By.id("days");
    By monthDropDown = By.id("months");
    By yearDropDown = By.id("years");
    By firstNameField = By.id("first_name");
    By lastNameField = By.id("last_name");
    By companyField = By.id("company");
    By address1Field = By.id("address1");
    By address2Field = By.id("address2");
    By countryDropDown = By.name("country");
    By stateField = By.id("state");
    By cityField =By.id("city");
    By zipcodeField = By.id("zipcode");
    By mobileNumberField = By.id("mobile_number");
    By continueButton = By.xpath("//button[@type = 'submit']");
    //Actions
    public void registerUser()
    {
        driver.findElement(genderField).click();
        driver.findElement(passwordField).sendKeys("123");
        //Select date
        Select daysDropdown;
        daysDropdown = new Select((driver.findElement(dayDropDown)));
        daysDropdown.selectByValue("1");
        Select monthsDropdown;
        monthsDropdown = new Select(driver.findElement(monthDropDown));
        monthsDropdown.selectByIndex(1);
        Select yearsDropDown ;
        yearsDropDown =  new Select((driver.findElement(yearDropDown)));
        yearsDropDown.selectByValue("1986");
        driver.findElement(firstNameField).sendKeys("Heba");
        driver.findElement(lastNameField).sendKeys("Ahmed");
        driver.findElement(companyField).sendKeys("Gaza Tec");
        driver.findElement(address1Field).sendKeys("Yafa");
        driver.findElement(address2Field).sendKeys("Yafa2");
        Select countriesDropdown;
        countriesDropdown = new Select(driver.findElement(countryDropDown));
        countriesDropdown.selectByValue("Canada");
        driver.findElement(stateField).sendKeys("Khan yonis");
        driver.findElement(cityField).sendKeys("rafah");
        driver.findElement(zipcodeField).sendKeys("555");
        driver.findElement(mobileNumberField).sendKeys("5858855");
        driver.findElement(continueButton).click();










    }







}
