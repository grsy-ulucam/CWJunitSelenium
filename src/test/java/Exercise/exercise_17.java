package Exercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class exercise_17  extends BaseTest {

    @Override
    public void tearDown() {
        //super.tearDown();
    }
    @Test
    public  void  dragAndOffset(){

        driver.get("https://rangeslider.js.org/");

        WebElement slider= driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1"));

        Actions actions =new Actions(driver);

        actions.dragAndDropBy(slider,300,0);


    }



}
