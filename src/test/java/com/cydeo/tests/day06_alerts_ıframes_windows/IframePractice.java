package com.cydeo.tests.day06_alerts_ıframes_windows;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

        //1. Create a new class called: T4_Iframes
public class IframePractice {
    WebDriver driver;
    @BeforeMethod
    //2. Create new test and make set ups
    public void setupMethod(){
        driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
@Test
    public void IframeTask(){
        //3. Go to: https://practice.cydeo.com/iframe
    driver.get("https://practice.cydeo.com/iframe");
    //4. Assert: “Your content goes here.” Text is displayed.
    WebElement FrameText=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
    driver.switchTo().frame(FrameText);
    WebElement ContentText=driver.findElement(By.xpath("//p"));

   String actualText= ContentText.getText();
    System.out.println("actualText = " + actualText);
    Assert.assertEquals(actualText,"Your content goes here.");


    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    //We must use switchTo(). parentframe() method to go back to main html part, and locate whichever web element want.
    driver.switchTo().parentFrame();

    WebElement headerText= driver.findElement(By.xpath("//h3"));
    String expectedText1="An iFrame containing the TinyMCE WYSIWYG Editor";
    String actualText1=headerText.getText();
    System.out.println("actualText1 = " + actualText1);
    Assert.assertEquals(actualText1,expectedText1);


    }


@AfterMethod
            public void CloseDown(){
        driver.quit();
}
}
