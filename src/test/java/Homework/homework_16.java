package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class homework_16 extends BaseTest {

    @Override
    public void tearDown() {
       // super.tearDown();
    }

    @Test
    public void name() {


      // Go to https://the-internet.herokuapp.com/download

        driver.get("https://the-internet.herokuapp.com/download");

      // Download sample.png file

        WebElement  png= driver.findElement(By.linkText("sample.png"));

        png.click();

        String upDownload="C:\\Users\\Acer\\Downloads\\sample.png";


      // Then verify if the file downloaded successfully

        Assert.assertTrue("not file found", Files.exists(Paths.get(upDownload)));






    }
}
