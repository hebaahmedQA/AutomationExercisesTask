Overview

This code package implements a test automation framework for user registration on a sample website using Selenium WebDriver and TestNG. It follows the Page Object Model (POM) design pattern 
This framework simplifies testing by reusing POM components and supporting cross-browser testing via the Factory Design Pattern.
The code aims to successfully register new users on three browsers: Chrome, Edge, and Firefox.


Key Components

Package Contents

* FactoryDesignPattern.BrowserDriverFactory: 
  Provides browser-specific WebDriver instances.
* Pom.Pages:
Contains POM classes for the application's web pages
* testAutomationRegisterUser:
Automates user registration on the website, leveraging the POM classes for interaction.


Pre-requisites:

* Install Java and Selenium dependencies.
* Set up TestNG for test execution.
* Run test suite via testNG xml file


Running the Test:

* Execute the UserRegister class as a TestNG test.
* The test will read browser names from the Excel sheet and perform user registration on the specified browsers.
  

Dependencies :

* Selenium WebDriver
* TestNG

