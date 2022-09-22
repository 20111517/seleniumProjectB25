package com.cydeo.tests.day_10_upload_actions_Jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SmartBearTask {

    //TC #1: Smartbear software link verification
    @Test
    public void SmartBearLinkVerification(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
        WebElement Loginbutton=Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        Loginbutton.click();
        WebElement countOfAllLİnks=Driver.getDriver().findElement(By.xpath("//a[.='View all orders']"));
        System.out.println("countOfAllLİnks = " + countOfAllLİnks);


    }
    //1. Open browser
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3. Enter username: “Tester”
    //4. Enter password: “test”
    //5. Click to Login button
    //6. Print out count of all the links on landing page
    //7. Print out each link text on this page





}
