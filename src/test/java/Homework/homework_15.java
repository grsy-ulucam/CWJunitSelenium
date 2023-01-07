package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class homework_15 extends BaseTest {
    @Override
    public void tearDown() {
       // super.tearDown();
    }

    @Test
    public void name() {

       // Go to URL: https://www.monsterindia.com/seeker/registration
        // Upload file.

        String filePath="C:\\Users\\Acer\\Desktop\\cv.docx";

        driver.get("https://www.monsterindia.com/seeker/registration");

        WebElement uplood= driver.findElement(By.id("file-upload"));

        uplood.sendKeys(filePath);








    }
}
