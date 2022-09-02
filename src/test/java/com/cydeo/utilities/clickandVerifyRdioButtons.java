package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class clickandVerifyRdioButtons {

    public static void main(String[] args) {
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
    clickandVerifyRadioButtons(driver,"color","red");
    clickandVerifyRadioButtons(driver,"sport","football");
    driver.quit();
    }
private static void clickandVerifyRadioButtons(WebDriver driver,String nameAttribute,String İdvalue){

    List<WebElement>radioButtons=driver.findElements(By.name(nameAttribute));
    for (WebElement each: radioButtons) {
        String EachId = each.getAttribute("id");
        if(İdvalue.equals(EachId)){
            each.click();
            System.out.println(EachId+" is selected:"+each.isSelected());
            break;
        }
    }



}










}
