package day02_Locator;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetText_getAtributes_Practice {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
        //3- Verify header text is as expected:
        //  Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();
        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        //4- Locate “First name” input box
        WebElement FirstNameInput = driver.findElement(By.name("firstname"));


        //5- Verify placeholder attribute’s value is as expected:
        //  Expected: first name
        String actualFirstName = FirstNameInput.getAttribute("placeholder");
        String expectedFirstName = "first name";
        if (expectedFirstName.equals(actualFirstName)) {
            System.out.println("passed");
        } else{
            System.out.println("failed");
        }
    }








}
