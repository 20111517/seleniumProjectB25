package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {


//1. Create a new class called BrowserUtils
//2. Create a method to make Task1 logic re-usable
//3. When method is called, it should switch window and verify title.
//Method info:
//• Name: switchWindowAndVerify
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String expectedInUrl
//• Arg3: String expectedTitle
public void switchWindowAndVerify(WebDriver driver,String expectedInUrl,String expectedInTitle) {
    Set<String> allWindows = driver.getWindowHandles();
    for (String each : allWindows) {
        driver.switchTo().window(each);
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains(expectedInUrl)) {
            break;
        }
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }


}
public void verifyTitle(WebDriver driver,String expectedTitle){
    String actualTitle= driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle);
}
}
