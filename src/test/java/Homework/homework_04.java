package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework_04 {
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

        // driver.quit();

    }

    @Test
    public void test01() {

        //Go to URL: https://demoqa.com/radio-button

        //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.

        //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

        driver.get("https://demoqa.com/radio-button");

        WebElement yes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yes.click();
        WebElement ımpresive = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        ımpresive.click();

        WebElement no = driver.findElement(By.xpath("//label[@class='custom-control-label disabled']"));

        no.click();

        System.out.println("konsola yes geldi mi: " + yes.getText());

        System.out.println("konsola impressive geldi mi: " + ımpresive.getText());

        System.out.println("konsola no geldi mi: " + no.getText());


    }
}
