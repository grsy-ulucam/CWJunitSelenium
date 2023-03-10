package Day3_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class C01_Practice {
//    Go to https://www.linkedin.com/
//    When we write an e-mail without the @ sign in the e-mail box and press enter.
//    Let's test the "Invalid email address" warning
    WebDriver driver;
    @Before

    public  void  setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }
    @After
    public  void  tearDown(){

       driver.quit();
    }
@Test
    public  void xpathPractice(){

        driver.get("https://www.linkedin.com/");

        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("emre.yucel48.45gmail.com" + Keys.ENTER);

        WebElement alertMessage=driver.findElement(By.xpath("//*[@class='alert-content']"));
        Assert.assertTrue(alertMessage.isDisplayed());
        //Assert.assertEquals(true,alertMessage.isDisplayed());
        //Assert.assertFalse(!alertMessage.isDisplayed());


}



}

