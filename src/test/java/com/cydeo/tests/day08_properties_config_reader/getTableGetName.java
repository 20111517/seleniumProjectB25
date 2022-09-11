package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class getTableGetName {
//TC #3: Create a custom method
//1- Open a chrome browser
WebDriver driver;

    //2. Create new test and make set ups
    @BeforeMethod
    public void SetupMethod() {
        driver = WebdriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
//2- Go to: https://practice.cydeo.com/tables
    @Test
    public void day08_task3(){
        driver.get("https://practice.cydeo.com/tables");

       getTableGetEmail(driver,"table2","Frank");

    }

public  static void getTableGetEmail(WebDriver driver, String tableNum,String firstName){
    String Locator = ("//table[@id='" + tableNum + "']//td[.='"+firstName+"']/following-sibling::td[1]");
    WebElement getTableGetEmail= driver.findElement(By.xpath(Locator));
    System.out.println( getTableGetEmail.getText());
    }


//
//3- Write custom method:
//
//• Method name: getTableGetEmail()
//• Return type: void
//• Arg1: WebDriver driver
//• Arg2: String tableNum
//• Arg3: String firstName
//
//



}
