package Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exercise_05 {
    WebDriver driver;

    @Before
    public  void setup(){

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.alibaba.com/");

        driver.manage().window().maximize();
    }

     @After
     public void tearDown(){
        //driver.quit();
     }
     @Test
     public void test01(){

        WebElement soylryın=driver.findElement(By.xpath("(//input[@name='SearchText'])[1]"));

        soylryın.sendKeys("welcome");
        System.out.println("soylryın = " + soylryın);

    }

}
