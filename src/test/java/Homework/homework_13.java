package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class homework_13 extends BaseTest {

    @Override
    public void tearDown() {
        // super.tearDown();
    }

    @Test
    public void name() throws AWTException {

        // https://api.jquery.com/ sitesine gidelim

        driver.get("https://api.jquery.com/");

        //arama alanina json yazalim

        WebElement search = driver.findElement(By.className("ds-input"));

        search.sendKeys("json");

        //Enter islemini robot class kullanrak yapalim

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);


    }
}
