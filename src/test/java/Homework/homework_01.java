package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework_01 {
//https://id.heroku.com/login sayfasına gidiniz.
//Bir mail adresi giriniz.
//Bir password giriniz.
//Login butonuna tıklayınız.
//"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
//Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
//Tüm sayfaları kapatınız.


    WebDriver driver;
    @Before
     public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
     @After
    public  void  tearDown(){
         driver.quit();
     }
     @Test
    public void signIn(){
        driver.get("https://id.heroku.com/login");

        driver.findElement(By.xpath("//input[@autofocus='true']")).sendKeys("emre.yucel48.45@gmail.com");

         driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("fatma"+ Keys.ENTER);

         WebElement display= driver.findElement(By.xpath("//div[text()='There was a problem with your login.']"));

         if (display.isDisplayed()==true){

             System.out.println("kayıt gerçekleşmedi");

         }else System.out.println("kayıt yapıldı");
     }


}
/*




 */