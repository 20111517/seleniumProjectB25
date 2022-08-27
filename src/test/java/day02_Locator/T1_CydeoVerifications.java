package day02_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {


    public static void main(String[] args) {

        //#1: Cydeo practice tool verifications
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        //3. Verify URL contains //Expected: cydeo
        driver.getCurrentUrl();
        String expectedUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL VERİFİCATİON PASSED");
        } else {
            System.out.println("URL VERİFİCATİON FAİLED");
        }
        //4. Verify title:

        //Expected: Practice
        driver.manage().window().maximize();
        driver.getTitle();
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed");
        } else {
            System.out.println("Title Verification Failed");

        }
        driver.close();
        }

    }