package com.cydeo.tests.day06_alerts_ıframes_windows;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdownPractices {
    @BeforeMethod
            public void setupMethod(){
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void dropdownTask05(){
        //3. Select Illinois
        //4. Select Virginia
        //5. Select California
        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)


    }











}
