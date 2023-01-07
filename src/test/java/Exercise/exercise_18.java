package Exercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class exercise_18 extends BaseTest {

    @Override
    public void tearDown() {
        //super.tearDown();
    }
    @Test
    public void hoverOver(){

        driver.get("https://www.amazon.com.tr/");

        WebElement accountAndLists= driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        Actions actions=new Actions(driver);

        actions.moveToElement(accountAndLists)

                .click(driver.findElement(By.id("nav-link-accountList-nav-line-1")))

                .perform();

        Assert.assertEquals("Amazon Giriş Yap",driver.getTitle());



    }




}
