package com.cydeo.tests.day07_Webtables_Utilities_JavaFaker;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandlingPractice {
    WebDriver driver;

    //1. Create new test and make set ups
    @BeforeMethod
    public void setupMethod() {
        driver = WebdriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
//2. Go to : https://www.amazon.com
//3. Copy paste the lines from below into your class
    public void day7_Task1() {
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
//4. Create a logic to switch to the tab where Etsy.com is open

        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }

//5. Assert: Title contains “Etsy”

            String actualTitle = driver.getTitle();
            System.out.println("actualTitle = " + actualTitle);

            String expectedTitle = "Etsy";
            Assert.assertTrue(actualTitle.contains(expectedTitle));
        }


//Lines to be pasted:
//
//These lines will simply open new tabs using something called JavascriptExecutor
//and get those pages. We will learn JavascriptExecutor later as well.
//
//
//
//


    }
}