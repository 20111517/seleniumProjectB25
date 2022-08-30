package com.cydeo.tests.Day5_TestNG_INtro_Dropdowns;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RadioButton {
    public static void main(String[] args) {


// //TC #2: Radiobutton handling
//        //1. Open Chrome browser
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        //3. Click to “Hockey” radio button
        WebElement HokeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        HokeyRadioBtn.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("HokeyRadioBtn.isSelected() = " + HokeyRadioBtn.isSelected());


        driver.quit();
    }
}