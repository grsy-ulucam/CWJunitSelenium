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

public class exercise_09 {
    WebDriver driver;


    @Before

    public void setup() {

        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

    }


    @After

    public void tearDown() {

        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.

        driver.quit();

    }
    @Test
    public  void  test01(){
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        WebElement idInPut= driver.findElement(By.name("cusid"));

        idInPut.sendKeys("123");
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        driver.switchTo().alert();

        driver.switchTo().alert().accept();

    }

}
