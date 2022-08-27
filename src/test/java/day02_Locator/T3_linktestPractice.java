package day02_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_linktestPractice {


    public static void main(String[] args) {
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2- Go to: https://google.com
        driver.get("https://www.google.com ");
        //3- Write “apple” in search box
        //4- PRESS ENTER using Keys.ENTER
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
        //5- Click google search button
        googleSearchBox.click();
        //6- Verify title:
        //Expected: Title should start with “apple” word
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title Verification Passed!!!");
        } else {
            System.out.println("Title Verification Failed!!!");

        }

        driver.close();


    }


}
