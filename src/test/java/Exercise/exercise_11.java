package Exercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class exercise_11 extends BaseTest {

    @Override
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public  void  iframe(){

        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement boldText= driver.findElement(By.tagName("h3"));

        String text=boldText.getText();

        Assert.assertTrue(text.contains("Editor"));

        driver.switchTo().frame(0);

        WebElement textBox=driver.findElement(By.xpath("//body[@id='tinymce']"));

          textBox.clear();

          textBox.sendKeys("hiiiiiii");

          driver.switchTo().defaultContent();

          Assert.assertTrue(driver.findElement(By.partialLinkText("Elemental")).isDisplayed());


    }
}
