package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class homework_06 {
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
     /*
     - https://demoqa.com/select-menu sitesine gidin

     - Multiple select yapabileceginiz <select> elementini locate edin

       - Birden fazla secim yapip secimlerinizi DOGRULAyin

         */

    @Test
    public void test01() {

        driver.get("https://demoqa.com/select-menu");

        Select select=new Select(driver.findElement(By.name("cars")));

        System.out.println("select.isMultiple() = " + select.isMultiple());

        select.selectByIndex(3);

        select.selectByIndex(1);


        List<WebElement>selectOption=select.getAllSelectedOptions();

        for (WebElement option:selectOption){

            System.out.println(option.getText());
        }

    }
}