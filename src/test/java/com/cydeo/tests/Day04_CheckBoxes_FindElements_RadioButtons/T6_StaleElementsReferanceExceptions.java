package com.cydeo.tests.Day04_CheckBoxes_FindElements_RadioButtons;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_StaleElementsReferanceExceptions {
    public static void main(String[] args) throws InterruptedException {
    //1- Open a chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement CydeoLink=driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("CydeoLink.isDisplayed() = " + CydeoLink.isDisplayed());
        //4- Refresh the page.
        Thread.sleep(3000);
        driver.navigate().refresh();
        //5- Verify it is displayed, again.

        WebElement CydeoLink1=driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("CydeoLink.isDisplayed() = " + CydeoLink1.isDisplayed());

    }
}