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
import java.util.List;

public class exercise_07 {
    //http://the-internet.herokuapp.com/add_remove_elements/

    // Click on the "Add Element" button 100 times.

    // Write a function that takes a number, and clicks the "Delete" button.

    // Given number of times, and then validates that given number of buttons was deleted.

    // 1. Method: createButtons(100)

    // 2. Method: DeleteButtonsAndValidate()
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
    public void cssSelectorTest() {

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        createElements(100);
        deleteButtonsValidate(40);
    }

    public void createElements(int amount) {

        WebElement addElementButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        for (int i = 0; i < amount; i++) {
            addElementButton.click();

        }
    }

    public void deleteButtonsValidate(int amount) {


        List<WebElement> deleteButtonList = driver.findElements(By.cssSelector("button[onclick='addElement()']"));

        int silinmedenOnceDeleteButtonListSayısı = deleteButtonList.size();

        for (int i = 0; i < amount; i++) {
            deleteButtonList.get(i).click();
        }

        List<WebElement> deleteButtonListAfter = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        int silinmedenSonraDeleteButtonSayısı = deleteButtonListAfter.size();

        Assert.assertEquals(silinmedenOnceDeleteButtonListSayısı - amount, silinmedenSonraDeleteButtonSayısı);


    }

}
