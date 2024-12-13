Overview

This code package implements a test automation framework for user registration on a sample website using Selenium WebDriver and TestNG. It follows the Page Object Model (POM) design pattern and incorporates a data-driven approach using an Excel sheet.
This framework simplifies testing by reusing POM components and supporting cross-browser testing via the Factory Design Pattern.
The code's purpose is to successfully register new users on three browsers: Chrome, Edge, and Firefox.


Key Components

Package Contents

Data.ExcelReader:
Reads test data (e.g., browser names) from an Excel file.

FactoryDesignPattern.BrowserDriverFactory: 
Provides browser-specific WebDriver instances.

Pom.Pages:
Contains POM classes for the application's web pages

@DataProvider:
Supplies browser names from the Excel sheet for testing.

testAutomationRegisterUser:
Automates user registration on the website, leveraging the POM classes for interaction.

@AfterMethod:
Ensures the browser is closed after each test.




Pre-requisites:

Install Java and Selenium dependencies.
Set up TestNG for test execution.
Ensure the Excel file with test data is available and correctly formatted.




Running the Test:

Execute the UserRegister class as a TestNG test.
The test will read browser names from the Excel sheet and perform user registration on the specified browsers.
Post-Test:
The browser session is closed after each test to maintain isolation.
Notes
Update the Excel file with valid browser names and necessary test data.




Dependencies
Selenium WebDriver
TestNG
Apache POI (for Excel reading)
