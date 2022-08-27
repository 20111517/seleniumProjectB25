package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //WebElement SignInButton=driver.findElement(By.className("login-btn"));
        WebElement SignInButton=driver.findElement(By.cssSelector("input[type='submit']"));
        String expectedSignInButtonText="Log In";
        String actualSignInButton=SignInButton.getAttribute("value");
        System.out.println("actualSignInButton = " + actualSignInButton);
        System.out.println("expectedSignInButtonText = " + expectedSignInButtonText);

        if(actualSignInButton.equals(expectedSignInButtonText)){
            System.out.println("Log ın Button Verification Passed");
        }else {
            System.out.println("Log ın Button Verification Failed");
        }
        //Getting the value of the attribute "value"
        driver.close();






    }


}




//LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES.
//	                   tagName[attribute='value']
//	                   input[class='login-btn']
// LOCATED USING CLASS ATTRIBUTE
//WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
// LOCATED USING TYPE ATTRIBUTE
//WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
// LOCATED USING VALUE ATTRIBUTE














/*TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Verify “Log in” button text is as expected:
        Expected: Log In



        PS: Inspect and decide which locator you should be using to locate web
        elements.
        PS2: Pay attention to where to get the text of this button from */