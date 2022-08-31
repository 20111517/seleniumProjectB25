package com.cydeo.tests.Day04_CheckBoxes_FindElements_RadioButtons;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_XPATHPRACTİCE {

    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver =WebdriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1
        WebElement ButtonOne=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        ButtonOne.click();
        WebElement clickbtn1=driver.findElement(By.xpath("//p[@id='result']"));
        String expectedBtn1="Clicked on button one!";
        String actualBtn1=clickbtn1.getText();
        if(actualBtn1.equals(expectedBtn1)){
            System.out.println("Verification Passed");
        }else {

            System.out.println("Verification Failed");
        }

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”



    }







}

