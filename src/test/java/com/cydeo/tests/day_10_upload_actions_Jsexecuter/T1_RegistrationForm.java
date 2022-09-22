package com.cydeo.tests.day_10_upload_actions_Jsexecuter;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_RegistrationForm {

    //1. Open browser
    //2. Go to website:https://practice.cydeo.com/registration_form
    //Driver.getDriver() --> driver

    @Test
    public  void registartion_form(){
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

        //cretae Java faker object
        Faker faker=new Faker();
        //3. Enter first name
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String fakerFirstName=faker.name().firstName();
        firstName.sendKeys(fakerFirstName);
        //Enter LAst NAme
        WebElement LastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        String fakerLastName=faker.name().lastName();
        LastName.sendKeys(fakerLastName);
        //Enter UserName
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String Username=faker.bothify("helpdesk####");
        userName.sendKeys(Username);
        //6. Enter email address
        WebElement emailAdress=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        String email=faker.bothify(Username+"@gmail.com");
        emailAdress.sendKeys(email);
        //7. Enter password
        WebElement passWord=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passWord.sendKeys(faker.numerify("########"));
        //8. Enter phone number
        WebElement phoneNumber=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));
        //9. Select a gender from radio buttons
        WebElement ınputGender=Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        ınputGender.click();
        //10.Enter date of birth
        WebElement dateofBirth=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateofBirth.sendKeys("11/07/1986");
        //dateofBirth.sendKeys(faker.number().numberBetween(1986,2022)+"");
        //11.Select Department/Office
        WebElement dropdown=Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
        Select departmentDropdown=new Select(dropdown);
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
        //12.Select Job Title
        WebElement Jobtitle=Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        Select JobTitledropdown=new Select(Jobtitle);
        JobTitledropdown.selectByVisibleText("Developer");
        //13.Select programming language from checkboxes
        WebElement ProgramingLanguage1=Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox1']"));
        ProgramingLanguage1.click();
        //Click to sign uup button
        WebElement SignuppButton=Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        SignuppButton.click();
        //verify text Message
       WebElement VerifyMessage=Driver.getDriver().findElement(By.xpath("//*[@id='content']/div/div/p"));
        System.out.println("VerifyMessage.isDisplayed() = " + VerifyMessage.isDisplayed());


        //


    }












}
