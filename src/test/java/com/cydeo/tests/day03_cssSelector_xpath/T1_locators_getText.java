package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Enter incorrect username: “incorrect”
        WebElement userNameInput = driver.findElement(By.className("login-inp"));
        userNameInput.sendKeys("incorrect");
        //4- Enter incorrect password: “incorrect”
        //To auto generate local variable
        //Mac: option + enter
        //Windows: alt + enter
        WebElement passWordInput = driver.findElement(By.name("USER_PASSWORD"));
        passWordInput.sendKeys("incorrect");
        //5- Click to log in button.
        WebElement LoginButton = driver.findElement(By.className("login-btn"));
        LoginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();
        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error Message Text Veriification Passed!!!");
        } else {
            System.out.println("Error Message Text Veriification Failed!!!");

        }
        driver.close();


    }
}
