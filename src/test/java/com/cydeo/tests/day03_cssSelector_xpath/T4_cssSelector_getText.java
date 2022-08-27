package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {


        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        //                  tagName[attribute='value']
        WebElement ResetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText = ResetPasswordButton.getAttribute("value");
        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)) {
            System.out.println("Reset Password Button Text Verification Passed");
        } else {
            System.out.println("Reset Password Button Text Verification Failed");
        }
        driver.close();
        //locating reset password button using class attribute and its value
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        //locating reset password button using VALUE attribute and its value


    }




    }














