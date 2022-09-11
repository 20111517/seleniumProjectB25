package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Webtable_Order_Verify {
  WebDriver driver;

//TC #1: Web table practice
    @BeforeMethod
    public void setupMethod(){
  driver= WebdriverFactory.getDriver("chrome");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
// 1. Go to: https://practice.cydeo.com/web-tables
//2. Verify Bob’s name is listed as expected.
//Expected: “Bob Martin”
//3. Verify Bob Martin’s order date is as expected
//Expected: 12/31/2021
    @Test
    public void day08Task1(){
        driver.get("https://practice.cydeo.com/web-tables");
        WebElement nameofBob=driver.findElement(By.xpath("//td[.='Bob Martin']"));
        String actualName=nameofBob.getText();
        String expectedName="Bob Martin";
        Assert.assertEquals(actualName,expectedName);

        WebElement orderDate= driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));
        String actualOrderDate=orderDate.getText();
        String  expectedOrderDate="12/31/2021";
        Assert.assertEquals(actualOrderDate,expectedOrderDate);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }









}
