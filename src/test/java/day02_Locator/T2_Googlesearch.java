package day02_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Googlesearch {

    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com ");
        //3- Click to A/B Testing from top of the list.
        driver.findElement(By.linkText("A/B Testing")).click();
        Thread.sleep(5000);
        //4- Verify title is: //   Expected: No A/B Test
        driver.getTitle();
       if((driver.getTitle()).equals("No A/B Test")) {
           System.out.println("Verification Passed");

       }else{
           System.out.println("Verification Failed");
       }
//5- Go back to home page by using the .back();
        driver.navigate().back();
        driver.getTitle();
       if((driver.getTitle()).equals("Practice")){
           System.out.println("Verification Passed");
       }else{
           System.out.println("Verification Failed");
       }
        Thread.sleep(5000);

    driver.close();
    }










}
