package com.cydeo.tests.Day04_CheckBoxes_FindElements_RadioButtons;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindsElements {

    public static void main(String[] args) {
        //Open a chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to: https://practice.cydeo.com/abtest
       driver.get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.
        List<WebElement>allLinks=driver.findElements(By.tagName("a"));
        //4- Print out the number of the links on the page.

        System.out.println("allLinks.size() = " + allLinks.size());
        //5- Print out the texts of the links.

        //6- Print out the HREF attribute values of the links
        //

        for (WebElement eachlink : allLinks) {

            System.out.println("Text of the  link:" +eachlink.getText());
            System.out.println("Href values of the link:" +eachlink.getAttribute("href"));

        }

    }









}
