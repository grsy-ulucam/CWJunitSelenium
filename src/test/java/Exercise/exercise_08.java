package Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exercise_08 {

    WebDriver driver;
    @Before
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @After
    public  void tearDown(){

       driver.quit();

    }
    @Test
    public  void test01(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        WebElement concent= driver.findElement(By.id("content"));

        Assert.assertTrue(concent.getText().contains("Congratulations"));

    }

}
