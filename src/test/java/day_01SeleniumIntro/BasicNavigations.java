package day_01SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {


    public static void main(String[] args) throws InterruptedException {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver=new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();
        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of the page
        String Currenttitle = driver.getTitle();
        System.out.println("Currenttitle = " + Currenttitle);
        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the google page
        String curentTitle = driver.getTitle();
        System.out.println("curentTitle = " + curentTitle);
        // Get the current URL using Selenium
        driver.getCurrentUrl();
        // this will close the currently opened window
        driver.close();
        // this will close all of the opened windows
        driver.quit();

    }









}







