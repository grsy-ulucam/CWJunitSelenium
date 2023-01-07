package Homework;

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

public class homework_03 {

    WebDriver driver;

    @Before

    public void setup(){

        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

    }
    @After

    public void tearDown(){

        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.

       // driver.quit();

    }
    @Test
    public void test01(){
        //    Go to URL: https://demoqa.com/

//    Click on Elements.

//    Click on Checkbox.

//    Verify if Home checkbox is selected.

//    Verify that "You have selected" is visible.

        driver.get("https://demoqa.com/");

        WebElement element=driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
        element.click();
        WebElement checkBox= driver.findElement(By.xpath("( //li[@id='item-1'])[1]"));
        checkBox.click();
        if (!checkBox.isSelected()){
            checkBox.click();

        }
        WebElement result= driver.findElement(By.xpath("//div[@class='pattern-backgound playgound-header']"));
        Assert.assertTrue(result.isDisplayed());
    }

}
