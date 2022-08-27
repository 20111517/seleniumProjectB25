package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttributes {


    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabelText=driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabelText="Remember me on this computer";
        String actualRememberMeLabelText=rememberMeLabelText.getText();
        if (actualRememberMeLabelText.equals(expectedRememberMeLabelText)){
            System.out.println("Text Verification Passed!!!");
        }else{
            System.out.println("Text Verification Failed!!!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLinkText=driver.findElement(By.className("login-link-forgot-pass"));
        String expectedforgotPasswordLinkText="FORGOT YOUR PASSWORD?";
        String actualforgotPasswordLinkText=forgotPasswordLinkText.getText();
        if (actualforgotPasswordLinkText.equals(expectedforgotPasswordLinkText)){
            System.out.println("Forgot Password Link Passed!!!");
        }else {
            System.out.println("Forgot Password Link Failed!!!");

        }

      //5- Verify “forgot password” href attribute’s value contains expected:
        //        //Expected: forgot_password =yes

        String expectedInHref="forgot_password=yes";
        String actualInHref=forgotPasswordLinkText.getAttribute("href");
        if (actualInHref.contains(expectedInHref)){
            System.out.println("Href Verification Passed!!!");
        }else {
            System.out.println("Href Verification Failed!!!");

        }

    driver.close();
    }








}
