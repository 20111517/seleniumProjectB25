package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_PRACTİCE {

    public static void main(String[] args) {

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
       driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Enter incorrect username into login box:
        WebElement LoginBox=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        LoginBox.sendKeys("incorrect username"+ Keys.ENTER);

        //4- Click to `Reset password` button

        //5- Verify “error” label is as expected
        WebElement ErrorLabel=driver.findElement(By.xpath("//div[@class='errortext']"));
        String expectedErrorLabel="Login or E-mail not found";
        String actualErrorLabel=ErrorLabel.getText();
        if(actualErrorLabel.equals(expectedErrorLabel)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        //Expected: Login or E-mail not found



    }












}
