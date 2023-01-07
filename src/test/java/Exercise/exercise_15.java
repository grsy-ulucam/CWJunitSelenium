package Exercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class exercise_15 extends BaseTest {
    @Override
    public void tearDown() {
       // super.tearDown();
    }
    @Test
    public void test01(){
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn= driver.findElement(By.id("doubleClickBtn"));

        Actions actions=new Actions(driver);

        actions.doubleClick(doubleClickBtn).perform();
        Assert.assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

    }
       @Test
    public  void test02(){
           driver.get("https://demoqa.com/buttons");
          WebElement rightClickBtn= driver.findElement(By.xpath("rightClickBtn"));

           Actions actions=new Actions(driver);

           actions.contextClick(rightClickBtn).build().perform();

           WebElement rightClickMessage= driver.findElement(By.id("rightClickMessage"));
           Assert.assertTrue(rightClickMessage.isDisplayed());
       }

    @Test
    public void test03(){

        driver.get("https://demoqa.com/buttons");

        WebElement clickBtn= driver.findElement(By.id("//button[.='Click Me']"));

        Actions actions=new Actions(driver);

        actions.click(clickBtn).build().perform();

        WebElement dynamıcClıckMessage= driver.findElement(By.id("dynamicClickMessage"));

        Assert.assertTrue(dynamıcClıckMessage.isDisplayed());

    }



}
