package Exercise;


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


public class exercise_21 extends BaseTest {

    @Test
    public void name() throws IOException {

        driver.get("https://www.n11.com/");

        WebElement logo=driver.findElement(By.xpath("//a[@title='hayat sana gelir']"));

        File logoScreen=logo.getScreenshotAs(OutputType.FILE);

        String date=new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());

       String path="test-output/Screenshots"+date+".png";

        FileUtils.copyFile(logoScreen,new File(path));

    }
}
