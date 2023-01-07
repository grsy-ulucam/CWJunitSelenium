package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class holmework_13 extends BaseTest {
    @Override
    public void tearDown() {
        //super.tearDown();
    }

    @Test
    public void test() throws InterruptedException {

        // Go to URL: http://demo.automationtesting.in/Alerts.html
        driver.get("http://demo.automationtesting.in/Alerts.html");

        // Click "Alert with OK" and click 'click the button to display an alert box:’
        WebElement firstClick = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
        firstClick.click();
        WebElement clickTheButtonfirst = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        clickTheButtonfirst.click();

        // Accept Alert(I am an alert box!) and print alert on console.
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        //Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
        WebElement secondClick = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        secondClick.click();
        WebElement clickThebuttonSecond = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        clickThebuttonSecond.click();


        // Cancel Alert  (Press a Button !)
        driver.switchTo().alert().dismiss();

        // Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’

        // "Textbox ile Uyarı"ya tıklayın ve "bilgi istemi kutusunu göstermek için düğmeyi tıklayın"a tıklayın
        WebElement thirdClick = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
        thirdClick.click();
        WebElement clickThebuttonthird = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        clickThebuttonthird.click();


        // And then sendKeys «BootcampCamp» (Please enter your name)

        driver.switchTo().alert().sendKeys("Gürsoy");

        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        // Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.
        WebElement yazi = driver.findElement(By.id("demo1"));

        Assert.assertTrue("yanlış", yazi.getText().equals("Hello Gürsoy How are you today"));

    }
}
