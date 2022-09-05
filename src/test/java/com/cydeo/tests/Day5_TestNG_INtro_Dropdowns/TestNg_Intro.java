package com.cydeo.tests.Day5_TestNG_INtro_Dropdowns;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNg_Intro {

    @BeforeClass
    public void setup() {
        System.out.println("Beforeclass is running");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("AfterClass is running");
    }

    @BeforeMethod
    public void setupMethod() {
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.n11.com");

    }

}
