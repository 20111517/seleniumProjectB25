package com.cydeo.tests.Day5_TestNG_INtro_Dropdowns;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_RadioButton_cont {
    public static void main(String[] args) {
    //TC #3: Utility method task for (continuation of Task2)
        //1. Open Chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> radioButtons=driver.findElements(By.name("sport"));
        for (WebElement eachradioButton : radioButtons) {

            String Eachid = eachradioButton.getAttribute("id");
            System.out.println("Each Id:"+Eachid);
            if(Eachid.equals("hockey")){
                eachradioButton.click();
                System.out.println("Hockey is selected:"+eachradioButton.isSelected());
                break;
            }
        }

        //3. Click to “Hockey” radio button
        //4. Verify “Hockey” radio button is selected after clicking.
        //
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //
        //Create a utility method to handle above logic.
        //Method name: clickAndVerifyRadioButton
        //Return type: void or boolean
        //Method args:
        //1. WebDriver
        //2. Name attribute as String (for providing which group of radio buttons)
        //3. Id attribute as String (for providing which radio button to be clicked)
        //
        //Method should loop through the given group of radio buttons. When it finds the
        //matching option, it should click and verify option is Selected.
        //Print out verification: true
        //
        //
    }












}
