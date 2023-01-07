package Exercise;

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

public class exercise_10 {
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

        //driver.quit();

    }
       @Test
    public  void  test01(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement drpDown= driver.findElement(By.xpath("//select[@name='country']"));

        Select select =new Select(drpDown);

        select.selectByIndex(15);


    }
    @Test
    public  void  test02(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement drpDown= driver.findElement(By.xpath("//select[@name='country']"));

        Select select =new Select(drpDown);

        select.selectByValue("CUBA");


    }
    @Test
    public  void  test03(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement drpDown= driver.findElement(By.xpath("//select[@name='country']"));

        Select select =new Select(drpDown);

      select.selectByVisibleText("CONGO");


    }

    @Test

    public  void multipleSelect(){

        driver.get("https://output.jsbin.com/osebed/");

        Select select =new Select(driver.findElement(By.id("fruits")));

        System.out.println(select.isMultiple());

        select.selectByValue("apple");

        select.selectByIndex(3);

    }


}
