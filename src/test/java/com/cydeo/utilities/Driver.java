package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //Creating a private Constructor,so we are closing access to the object of this class from outside the class.
    private Driver() {
    }


    private static WebDriver driver;


    //Create a re-usable utility method which will return same instance driver when we call it.
    public static WebDriver getDriver() {
        if (driver == null) {


            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;


            }
        }
        return driver;
    }

    //this method will make sure our driver always null after using quit() method.
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }


    }
}