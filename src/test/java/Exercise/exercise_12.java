package Exercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class exercise_12 extends BaseTest {

    @Override
    public void tearDown() {
        super.tearDown();
    }
    @Test
    public  void test01() {

        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        driver.switchTo().frame("emoojis");

        WebElement secondEmojiTab= driver.findElement(By.xpath("(//a[@class='mdl-tabs__tab'])[1]"));

        secondEmojiTab.click();

        List<WebElement>emojiList=driver.findElements(By.xpath("//div[@id='nature']//img"));

        emojiList.forEach(WebElement::click);

        driver.switchTo().defaultContent();

        WebElement text=driver.findElement(By.id("text"));

        text.sendKeys("Text");

        WebElement smiles=driver.findElement(By.id("smiles"));

        smiles.sendKeys("Smiles");

        WebElement nature=driver.findElement(By.id("nature"));

        nature.sendKeys("Nature");

        WebElement food=driver.findElement(By.id("food"));

        food.sendKeys("Food");

        WebElement activities=driver.findElement(By.id("activities"));

        activities.sendKeys("Text");

        WebElement places=driver.findElement(By.id("places"));

        places.sendKeys("Places");

        WebElement objects=driver.findElement(By.id("objects"));

        text.sendKeys("Objects");

       WebElement applyButton=driver.findElement(By.id("send"));

       applyButton.click();


    }

}
