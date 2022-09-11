package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebtableUtils {

    public static String returnOrderDate(WebDriver driver, String customerName) {
        String Locator = ("//td[.='" + customerName + "']/following-sibling::td[3]");
        WebElement customerOrderDate = driver.findElement(By.xpath(Locator));
        return customerOrderDate.getText();
    }

public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){
    String Locator = "//td[.='" + customerName + "']/following-sibling::td[3]";

        WebElement customerDatacell= driver.findElement(By.xpath(Locator));
        String actualOrderDate=customerDatacell.getText();
    Assert.assertEquals(actualOrderDate,expectedOrderDate);
}


}

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order














