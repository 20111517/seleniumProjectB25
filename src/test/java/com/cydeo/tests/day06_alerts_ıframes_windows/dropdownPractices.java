package com.cydeo.tests.day06_alerts_ıframes_windows;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdownPractices {
    WebDriver driver;
    @BeforeMethod
            public void setupMethod(){
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
         driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void dropdownTask05() throws InterruptedException {

        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");

        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        String expectedOption=stateDropdown.getFirstSelectedOption().getText();
        //3. Select Illinois
        //4. Select Virginia
        //5. Select California
        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)


    }











}
