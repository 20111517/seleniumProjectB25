package com.cydeo.tests.Day5_TestNG_INtro_Dropdowns;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_simpleDropdowns {

        WebDriver driver;
        @BeforeMethod
        public void setupMethod(){
            //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
            //default values
            //1. Open Chrome browser
            WebDriver driver = WebdriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            //2. Go to https://practice.cydeo.com/dropdown
            driver.get("https://practice.cydeo.com/dropdown");

        }
        @Test
    public void simpleDropdownTest() {
        //3. Verify “Simple dropdown” default selected value is correct
        //Expected:Please select an option
        Select simpleDropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedoption=simpleDropdown.getFirstSelectedOption();

         String actualDropdownText=currentlySelectedoption.getText();

         String expectedDropdownText="Please select an option";

         Assert.assertEquals(actualDropdownText,expectedDropdownText);

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
            WebElement firstSelectedOption = stateDropdown.getFirstSelectedOption();
            String actualStateDropdown=firstSelectedOption.getText();
            String expectedStateDropdown="Select a State";
            Assert.assertEquals(actualStateDropdown,expectedStateDropdown);

        }
        }











