package Pom.Tests;

import Data.ExcelReader;
import FactoryDesignPattern.BrowserDriverFactory;
import Pom.Pages.AccountCreatedPage;
import Pom.Pages.HomePage;
import Pom.Pages.LoginPage;
import Pom.Pages.RegisterationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.io.IOException;

public class UserRegister {

    private WebDriver driver;
    private HomePage homePage ;
    private LoginPage loginPage;
    private RegisterationPage registerationPage;
    private AccountCreatedPage accountCreatedPage;


    // DataProvider to add browser name from Excel sheet
    @DataProvider(name = "excelData")
    public Object[][] userRegisterData() throws IOException {
        return new ExcelReader().getExcelData();
    }

    // Test method for user registration
    @Test(dataProvider = "excelData")
    @Parameters("browserName")
    public void testAutomationRegisterUser(String browserName) {
        driver = BrowserDriverFactory.getBrowser(browserName); //provided  WebDriver  based on the browser name
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        // Perform user registration steps

        homePage =new HomePage(driver);
        loginPage =new LoginPage(driver);
        registerationPage = new RegisterationPage(driver);
        accountCreatedPage = new AccountCreatedPage(driver);
        homePage.clicksignupButton();
        loginPage.signupClicking();
        registerationPage.registerUser();
        accountCreatedPage.verifyAccountCreated();


    }

    // Close browser after each test
    @AfterMethod
    public void tearDown() {
         driver.quit();
    }
}
