package com.cydeo.tests.day_10_upload_actions_Jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T2_uploadPractice {

    //TC #2 Upload Test
    //1. Go to https://practice.cydeo.com/upload
@Test
public void Upload_test(){
    Driver.getDriver().get("https://practice.cydeo.com/upload");
    //2. Find some small file from your computer, and get the path of it.
    String Path="C:\\Users\\Esonic\\Desktop\\HTML CLASS\\indir.jpg";
    //3. Upload the file.
    WebElement uploadedFile=Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
    BrowserUtils.sleep(2);
    uploadedFile.sendKeys(Path);

    WebElement uploadFileButton=Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
    uploadFileButton.click();

    //4. Assert:
    //-File uploaded text is displayed on the page
    WebElement headerText=Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
    Assert.assertTrue(headerText.isDisplayed());
    System.out.println("headerText.getText() = " + headerText.getText());
}
@AfterMethod
        public void tearDown() {
    Driver.getDriver().close();
}



}
