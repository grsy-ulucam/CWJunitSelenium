package Exercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class exercise_13 extends BaseTest {
    @Override
    public void tearDown() {
        //super.tearDown();
    }
        @Test
        public void windowHandles(){

            driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

            String homeId= driver.getWindowHandle();

            List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

            links.get(0).click();

            links.get(1).click();

            Set<String>windows=driver.getWindowHandles();

            Iterator<String>iterator=windows.iterator();

            while (iterator.hasNext()){
                driver.switchTo().window(iterator.next());
                if (driver.getWindowHandle().equals(homeId)){
                    continue;
                }
                driver.close();
            }




    }
}
