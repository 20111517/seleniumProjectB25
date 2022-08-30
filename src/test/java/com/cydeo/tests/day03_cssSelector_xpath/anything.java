package com.cydeo.tests.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class anything {
    public static void main(String[] args) {

         //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
       driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement Homelİnk=driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. “Forgot password” header
        WebElement ForgotPasswordText=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //c. “E-mail” text
        WebElement EmailText=driver.findElement(By.xpath("//label[@for='email']"));
        //d. E-mail input box
        WebElement EmailInputbox=driver.findElement(By.cssSelector("input[name='email']"));
        //e. “Retrieve password” button
        WebElement RetrievePasswordButton=driver.findElement(By.cssSelector("button[id='form_submit']"));
        //f. “Powered by Cydeo text
        WebElement PoweredbyCydeo=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        //4. Verify all web elements are displayed.
        System.out.println("Homelİnk.isDisplayed() = " + Homelİnk.isDisplayed());
        System.out.println("ForgotPasswordText.isDisplayed() = " + ForgotPasswordText.isDisplayed());
        System.out.println("EmailText.isDisplayed() = " + EmailText.isDisplayed());
        System.out.println("EmailInputbox.isDisplayed() = " + EmailInputbox.isDisplayed());
        System.out.println("RetrievePasswordButton.isDisplayed() = " + RetrievePasswordButton.isDisplayed());
        System.out.println("PoweredbyCydeo.isDisplayed() = " + PoweredbyCydeo.isDisplayed());
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }

}
