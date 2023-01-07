package garytask;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class garyTask7 extends BaseTest {
    @Override
    public void tearDown() {
       // super.tearDown();
    }
/*

    1- https://demoqa.com/droppable adresine gidelim.

    2- "Drag me" butonunu tutup "Drop here" kutusunun üstüne bırakalım.

    3- "Drop here" yazısı yerine "Dropped!" olduğunu test edin.

*/



    @Test

    public void test(){



        driver.get("https://demoqa.com/droppable");



        Actions actions = new Actions(driver);



        WebElement dragMe = driver.findElement(By.id("draggable"));

        WebElement dropHere = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));



        actions.dragAndDrop(dragMe, dropHere).perform();



        Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Dropped!']")).getText(), "Dropped!");

    }




}
