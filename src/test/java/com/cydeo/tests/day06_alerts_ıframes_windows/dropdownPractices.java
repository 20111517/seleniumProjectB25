package com.cydeo.tests.day06_alerts_ıframes_windows;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class dropdownPractices {
    WebDriver driver;
    @BeforeMethod
            public void setupMethod(){
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
        driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
    @Test
    public void dropdownTask05() throws InterruptedException {

        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");

        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        String actualOption=stateDropdown.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        String expectedOption="California";
        Assert.assertEquals(actualOption,expectedOption);

        //3. Select Illinois
        //4. Select Virginia
        //5. Select California
        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)



    }

    @Test
    public void dropdownTas06(){

        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown

        //Select year using  : visible text
        Select yearOption=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearOption.selectByVisibleText("1923");

        //Select month using   : value attribute
        Select monthOption=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthOption.selectByValue("11");

        //Select day using : index number
        Select dayOption=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayOption.selectByIndex(0);

        String expectedYear="1923";
        String expectedMonth="December";
        String expectedDay="1";

        String actualYear=yearOption.getFirstSelectedOption().getText();
        String actualMonth=monthOption.getFirstSelectedOption().getText();
        String actualDay=dayOption.getFirstSelectedOption().getText();


        //3. Select “December 1st, 1923” and verify it is selected.
        Assert.assertEquals(expectedYear,actualYear);
        Assert.assertEquals(expectedMonth,actualMonth);
        Assert.assertEquals(expectedDay,actualDay);
    }

    @Test
    public void dropdownTask07(){

        //TC #7: Selecting value from non-select dropdown
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown

        //3. Click to non-select dropdown
        WebElement nonSelectDropdown=driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();
        //4. Select Facebook from dropdown
        WebElement facebookBtn=driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookBtn.click();
        //5. Verify title is “Facebook - Log In or Sign Up”
        driver.getTitle();
        String expectedTitle="Facebook - Giriş Yap veya Kaydol";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);


    }
    @Test
    public void dropdownTask08(){
        //TC #8: Selecting value from multiple select dropdown
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown

        //3. Select all the options from multiple select dropdown.
        Select multipleDropdown=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement>allOptions=multipleDropdown.getOptions();
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }


       // multipleDropdown.deselectAll();
        //4. Print out all selected values.
        //5. Deselect all values.
    }


@AfterMethod
    public  void tearDown(){
        driver.quit();
}

}
