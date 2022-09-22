package com.cydeo.tests.day_11Actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

//TC #4: Scroll practice
    //1- Open a Chrome browser
    //2- Go to: https://practice.cydeo.com/
    @Test
    public void action_practice_test1(){
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        //Create object of Actions and pass our "driver" instance
        Actions actions=new Actions(Driver.getDriver());
        WebElement CydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        BrowserUtils.sleep(2);
        actions.moveToElement(CydeoLink).perform();
        //5- Scroll back up to “Home” link using PageUP button
        WebElement HomeLink=Driver.getDriver().findElement(By.linkText("Home"));
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();


        Driver.closeDriver();

    }
@Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
}
@Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
    Driver.closeDriver();
    }





}
