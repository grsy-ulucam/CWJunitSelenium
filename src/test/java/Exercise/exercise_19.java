package Exercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class exercise_19 extends BaseTest {
    @Override
    public void tearDown() {
        //super.tearDown();
    }
    @Test

    public void keyboardActions(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement input= driver.findElement(By.id("autoCompleteMultipleContainer"));

        Actions actions=new Actions(driver);

        actions.
                click(input).
                keyDown(Keys.SHIFT).
                sendKeys("y").
                keyUp(Keys.SHIFT).
                sendKeys("ou are ").
                keyDown(Keys.SHIFT).
                sendKeys("e")
                .keyUp(Keys.SHIFT)
                .sendKeys("xceptional").perform();


    }




}
