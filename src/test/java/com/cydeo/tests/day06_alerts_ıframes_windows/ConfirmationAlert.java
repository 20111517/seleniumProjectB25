package com.cydeo.tests.day06_alerts_ıframes_windows;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ConfirmationAlert {
    //TC #2: Confirmation alert practice
    WebDriver driver;
@BeforeMethod
        //1. Open browser
    public  void setupMethod(){
    driver= WebdriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}
    @Test
    public void ConfirmationAlert(){
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
       driver.get("http://practice.cydeo.com/javascript_alerts");
        //3. Click to “Click for JS Confirm” button
        WebElement JsConfirmButton=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        JsConfirmButton.click();

        //4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement verifyText=driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println("verifyText.isDisplayed() = " + verifyText.isDisplayed());
        String expectedText="You clicked: Ok";
        String actualText=verifyText.getText();
        Assert.assertEquals(expectedText,actualText);



    }
@Test
    public void JspromtAlert() throws InterruptedException {
    driver.get("http://practice.cydeo.com/javascript_alerts");
    WebElement JsPromtButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
    JsPromtButton.click();

    Alert alert = driver.switchTo().alert();
    Thread.sleep(1000);
    alert.sendKeys("Yes");
    Thread.sleep(1000);
    alert.accept();


}
    @AfterMethod
    public void closeDown(){
    driver.quit();
}




}
