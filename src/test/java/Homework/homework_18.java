package Homework;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class homework_18 extends BaseTest {

    @Override
    public void tearDown() {
        //super.tearDown();
    }

    @Test
    public void name() throws IOException {

        //Go to URL: https://opensource-demo.orangehrmlive.com/

        driver.get("https://opensource-demo.orangehrmlive.com/");


        //Getting screenshot of  Orange HRM Page Section.

        WebElement orange= driver.findElement(By.className("orangehrm-login-branding"));

        File orangeScreenshot = orange.getScreenshotAs(OutputType.FILE);

        //Save the screenshot with format 'screenshotname_yyyy_MM_dd_hh_mm_ss.png'

        String date = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());

        String path = "test-output\\Screenshots\\logoScreenshot_" + date + ".png";

        FileUtils.copyFile(orangeScreenshot,new File(path));

    }
}
