package day02_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttributes {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
        //3- Verify header text is as expected:
        //Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedheaderText = "Registration form";
        String actualheadertText = headerText.getText();
        if (actualheadertText.equals(expectedheaderText)) {
            System.out.println("Header Text Verification Passed!!");
        } else {
            System.out.println("Header Text Verification Failed!!");
        }

        //4- Locate “First name” input box
        // we are locating the web element using "name" locator
        // name attribute has "firstname" value
        //WebElement firstNameInput = driver.findElement(By.name("firstname"));
        WebElement firstNameİnputBox = driver.findElement(By.name("firstname"));

        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name

        String expectedplaceHolderAtributesValue = "first name";
        String actualplaceHolderAtributesValue = firstNameİnputBox.getAttribute("placeholder");
        if (actualplaceHolderAtributesValue.equals(expectedplaceHolderAtributesValue)) {
            System.out.println("PlaceHolder Verification Passed!!! ");
        } else {
            System.out.println("PlaceHolder Verification Failed!!!");
        }

        driver.close();
    }
}
