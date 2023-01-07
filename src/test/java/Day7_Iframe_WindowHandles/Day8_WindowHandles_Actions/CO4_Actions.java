package Day7_Iframe_WindowHandles.Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class CO4_Actions extends BaseTest {

    @Test
    public  void  dragAndOffset(){
       driver.get("https://rangeslider.js.org/");
        WebElement slider= driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));

        Actions actions=new Actions(driver);
        actions.dragAndDropBy(slider,-400,0).perform();

    }

}
