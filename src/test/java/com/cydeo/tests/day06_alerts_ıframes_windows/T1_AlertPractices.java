package com.cydeo.tests.day06_alerts_ıframes_windows;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_AlertPractices {
    WebDriver driver;
@BeforeMethod
    public  void setupMethod(){
//TC #1: Information alert practice
//1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
     driver= WebdriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://practice.cydeo.com/javascript_alerts");
}
@Test
    public void ınformationAlertPractice(){
//3. Click to “Click for JS Alert” button
    WebElement jsAlertBtn=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
    jsAlertBtn.click();
//4. Click to OK button from the alert
    //To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
    Alert alert=driver.switchTo().alert();
    alert.accept();

    WebElement VerifyText= driver.findElement(By.xpath("//p[@id='result']"));

    System.out.println("VerifyText.isDisplayed() = " + VerifyText.isDisplayed());

}

//5. Verify “You successfully clicked an alert” text is displayed.






}
