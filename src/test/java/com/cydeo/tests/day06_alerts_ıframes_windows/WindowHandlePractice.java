package com.cydeo.tests.day06_alerts_ıframes_windows;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//1. Create a new class called: T5_WindowsPractice
public class WindowHandlePractice {
    WebDriver driver;

//2. Create new test and make set ups
@BeforeMethod
    public void SetupMethod(){
    driver= WebdriverFactory.getDriver("Chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
    @Test
    public void WindowsHandling(){
        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
        //4. Assert: Title is “Windows”
        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        String actualTitle=driver.getTitle();
        String expectedTitle="Windows";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
        //5. Click to: “Click Here” link
        WebElement clickHereBtn= driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHereBtn.click();
        //6. Switch to new Window.
        Set<String>allWindowHandles=driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println(each);
        }


        //7. Assert: Title is “New Window”
        String AfterclickTitle=driver.getTitle();
        String expectedTitle1="New Window";
        Assert.assertEquals(AfterclickTitle,expectedTitle1);
    }


@AfterMethod
    public void tearDown(){
    driver.quit();
}
}
