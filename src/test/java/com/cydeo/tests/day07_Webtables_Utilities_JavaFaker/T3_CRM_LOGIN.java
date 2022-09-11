package com.cydeo.tests.day07_Webtables_Utilities_JavaFaker;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

    WebDriver driver;

//TC #3: Login scenario
    //1. Create new test and make set ups
    @BeforeMethod
    public void setupMethod() {
        driver = WebdriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void LoginTask(){

//2. Go to : http://login1.nextbasecrm.com/
driver.get("http://login1.nextbasecrm.com/");
//3. Enter valid username
        WebElement loginBtn=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBtn.sendKeys("helpdesk1@cybertekschool.com");
//4. Enter valid password
        WebElement passswordBtn=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passswordBtn.sendKeys("Helpdesk2@cybertekschool.com");

//5. Click to `Log In` button
        WebElement clickBtn= driver.findElement(By.xpath("//input[@class='login-btn']"));
        clickBtn.click();
//6. Verify title is as expected:
//Expected: Portal


    }


//USERNAME  PASSWORD
//helpdesk1@cybertekschool.com  UserUser
//Helpdesk2@cybertekschool.com  UserUser
//











}
