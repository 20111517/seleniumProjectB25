package com.cydeo.tests.day_10_upload_actions_Jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T6_JavaScriptexecuterText {
    //TC #6: Scroll using JavascriptExecutor
    //1- Open a Chrome browser
    //2- Go to: https://practice.cydeo.com/infinite_scroll
    @Test
    public void Jsexecuter_test1(){
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        //3- Use below JavaScript method and scroll
       //avascriptExecutor js=(JavascriptExecutor).Driver.getDriver();
        //a. 750 pixels down 10 times.
        for (int i = 0; i <10;i++) {
            BrowserUtils.sleep(1);
        }
}
}