package Exercise;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;


public class exercise_22 extends BaseTest {

    @Test
    public void name() {

        driver.get("http://demo.guru99.com/test/web-table-element.php");

        WebElement table = driver.findElement(By.className("dataTable")).findElement(By.tagName("tbody"));

        WebElement row3 = table.findElement(By.xpath(".//tr[4]"));

        WebElement row3cell3 = row3.findElement(By.xpath(".//td[2]"));

        int satirSayisi = table.findElements(By.xpath(".//tr")).size();

        System.out.println(satirSayisi);

        int sutunSayisi = row3.findElements(By.xpath(".//td")).size();

        System.out.println(sutunSayisi);

        for (int i = 1; i <= satirSayisi; i++) {

            for (int j = 1; j <= sutunSayisi; j++) {

                By locator = By.xpath(".//tr[" + i + "]//td[" + j + "]");

                WebElement tableData = table.findElement(locator);

                System.out.print(tableData.getText() + " ");

            }
            System.out.println();


        }
    }
}