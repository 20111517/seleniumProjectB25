package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Staleelement {

    public static void main(String[] args) {
        //TC #6: StaleElementReferenceException Task
        //1- Open a chrome browser
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://google.com");
        WebElement OturumLink= driver.findElement(By.xpath("//a[.='Oturum açın']"));
        System.out.println("OturumLink.isDisplayed() = " + OturumLink.isDisplayed());
        driver.navigate().refresh();
        WebElement OturumLink1= driver.findElement(By.xpath("//a[.='Oturum açın']"));

        System.out.println("OturumLink.isDisplayed() = " + OturumLink1.isDisplayed());

    }

}
