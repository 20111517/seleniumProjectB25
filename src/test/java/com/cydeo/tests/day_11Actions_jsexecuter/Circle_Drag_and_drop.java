package com.cydeo.tests.day_11Actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Circle_Drag_and_drop {

//TC #: Drag and drop
//1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    @Test
    public void Drag_and_drop_test(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
//2. Drag and drop the small circle to bigger circle.
    //Locate accept Cookies BUtton and click.
        WebElement acceptcookiesBUtton=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptcookiesBUtton.click();

        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement biggerCicle=Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,biggerCicle).perform();

//3. Assert:
//-Text in big circle changed to: “You did great!”
        String actualText=biggerCicle.getText();
        String expectedText="You did great!";
        Assert.assertEquals(actualText,expectedText);


    }



}
