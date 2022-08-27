package day_01SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01_YahooVerification {


    public static void main(String[] args) {
        //  Yahoo Title Verification

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.yahoo.com
        driver.get(" https://www.yahoo.com");
        //3. Verify title:
        driver.getTitle();
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed");
        } else {
            System.err.println("Title Verification Failed");
        }
        //Expected: Yahoo}


    }
}