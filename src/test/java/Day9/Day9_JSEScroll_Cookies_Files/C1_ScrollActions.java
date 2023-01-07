package Day9.Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C1_ScrollActions extends BaseTest {

    @Override
    public void tearDown() {
        super.tearDown();
    }
    @Test

    public  void scrollPageDown() throws InterruptedException {

        driver.get("https://www.amazon.com/");

        Actions actions=new Actions(driver);

        Thread.sleep(200);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(200);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(200);

        actions.sendKeys(Keys.PAGE_UP).perform();

        Thread.sleep(200);

        actions.sendKeys(Keys.PAGE_UP).perform();

    }
    @Test
    public  void  scrollArrowDown() throws InterruptedException {

        driver.get("https://www.amazon.com/");

        Actions act=new Actions(driver);

        Thread.sleep(200);

        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(200);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(200);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(200);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(200);

    }
}
