package com.cydeo.tests.Day04_CheckBoxes_FindElements_RadioButtons;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_CheckBoxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1= driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2=driver.findElement(By.xpath("//input[@id='box2']"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkbox2.click();
        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        if (checkbox1.isSelected()){
            System.out.println("Checkbox 1 is selected");
        }else{
            System.out.println("Checkbox 1 is not selected");
        }
        if (!checkbox2.isSelected()){
            System.out.println("Checkbox 2 is not slected");
        }else{
            System.out.println("Checkbox 2 is selected");
        }



    }






}
