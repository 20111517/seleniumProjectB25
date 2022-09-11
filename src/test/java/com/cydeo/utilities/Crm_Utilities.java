package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Crm_Utilities {


    public static void crmLogin(WebDriver driver, String userName, String Password) {
        //Enter UserName
        WebElement userNameBtn =driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameBtn.sendKeys(userName);
        //Enter Password
        WebElement passwordBtn=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBtn.sendKeys(Password);
        //Click Login Button
        WebElement loginBtn=driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }
}