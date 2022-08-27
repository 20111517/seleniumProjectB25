package day02_Locator;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day2_Homework1 {

    public static void main(String[] args) {
        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        //3. Search for “wooden spoon”
        WebElement SearchBox = driver.findElement(By.id("global-enhancements-search-query"));
        SearchBox.sendKeys("wooden spoon" + Keys.ENTER);
        driver.getTitle();
        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification Passed!!!");
        } else {

            System.out.println("Verification Failed!!!");
        }


    }
}
