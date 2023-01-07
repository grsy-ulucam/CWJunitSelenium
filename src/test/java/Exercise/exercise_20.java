package Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.BaseTest;

import java.io.File;
import java.io.IOException;

public class exercise_20 extends BaseTest {

    @Test
    public void name() throws IOException {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();

        driver.get("https://www.alibaba.com/");

        File source=((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);

       //test-output/Screenshots.png

        FileUtils.copyFile(source,new File("test-output/Screenshots.png"));






    }}
