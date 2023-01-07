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

public class homework_05 {
    /*
   - https://demoqa.com/select-menu sitesine gidin
           - <select> elementini locate edin
    - <select> elementinin seceneklerini yazdirin
     - Sirasiyla selectByIndex, selectByValue, selectByVisibleText methodlarini kullanarak;
   * Yellow (index)
   * Purple (value)
   * Black  (text)
   seceneklerini secin
    */
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
    public void test01() {

        driver.get("https://demoqa.com/select-menu");

        WebElement drpDown = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(drpDown);

        System.out.println(select.isMultiple());

        select.selectByIndex(3);

        select.selectByValue("4");

        select.selectByVisibleText("Black");
    }


}
