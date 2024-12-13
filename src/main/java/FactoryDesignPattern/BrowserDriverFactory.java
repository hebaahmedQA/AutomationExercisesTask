package FactoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserDriverFactory {
//return  WebDriver  based on the browser name to use it in user register method
    public static WebDriver getBrowser(String browserName){

        WebDriver driver = null;

      /*
        switch (browserName.toLowerCase())
        {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case"edge" :
                driver =new EdgeDriver();
            default:
                throw new IllegalArgumentException("can not found  " + browserName);*/



        if (browserName.equalsIgnoreCase("chrome"))
            {
                driver = new ChromeDriver();

            }
            else if (browserName.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();

            } else if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
            else
            {
                throw new IllegalArgumentException("can not found " + browserName);
                }







        return driver;


    }

}
