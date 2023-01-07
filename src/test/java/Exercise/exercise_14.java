package Exercise;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class exercise_14 extends BaseTest {
    @Override
    public void tearDown() {
       // super.tearDown();
    }
     @Test
    public  void  test01(){

        driver.get("https://testproject.io/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://blog.testproject.io/\"");
     }
    @Test
    public  void teat02(){
        driver.get("https://blog.testproject.io/");

        WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);

        newTab.get("https://www.amazon.com/");

        System.out.println(driver.getTitle());

    }
    @Test
    public void  test03(){
        driver.get("https://www.amazon.com/");

        String homePageId=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.amazon.com.tr/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.google.com.tr/?hl=tr");

        Set<String>handles=driver.getWindowHandles();

        Iterator<String>i=handles.iterator();

        while (i.hasNext()){
            String currentTab=i.next();
            driver.switchTo().window(currentTab);
            System.out.println(driver.getTitle());
            if (!driver.getWindowHandle().equals(homePageId)) {
                driver.close();
            }
            if (!driver.getTitle().contains("Spend")){
                driver.close();
            }
        }

    }


}
