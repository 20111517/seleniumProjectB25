package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T4_config_Practice {
  //  WebDriver driver;
//@BeforeMethod
    //public void setupMethod(){
    //String browserType= ConfigurationReader.getProperty("browser");
    //driver= WebdriverFactory.getDriver(browserType);
    //driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


@Test
    public void google_search_test(){

    Driver.getDriver().get("https://www.google.com");
    WebElement googlesearchBox= Driver.getDriver().findElement(By.xpath("input[@name='q']"));
    googlesearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
    String expectedTitle=ConfigurationReader.getProperty("searchValue")+ " - Google Search";
    String actualTitle=Driver.getDriver().getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
}
 @AfterMethod
    public void tearDown(){
    Driver.getDriver().close();
 }







}
