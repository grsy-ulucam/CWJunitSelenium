package Day9.Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C3_RobotClass extends BaseTest {
    @Override
    public void tearDown() {
       // super.tearDown();
    }

    @Test

    public  void  test() throws AWTException, InterruptedException {
        driver.get("https://demo.guru99.com/test/upload/");

        WebElement input= driver.findElement(By.id("uploadfile_0"));

        input.sendKeys("C:\\Users\\Acer\\IdeaProjects\\CWJunitSelenium\\src\\test\\java\\resources\\robot.txt");

        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);//BASILI TUTTUK CTRL

        robot.keyPress(KeyEvent.VK_S);//S tuşuna bastık
        Thread.sleep(300);

        robot.keyRelease(KeyEvent.VK_CONTROL);//key release tuşu serbest bırakır.

        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(300);
        robot.keyPress(KeyEvent.VK_ENTER);//enter tuşuna bastık

        robot.keyRelease(KeyEvent.VK_ENTER);//enter tuşunu bıraktık
        Thread.sleep(300);
        robot.keyPress(KeyEvent.VK_LEFT);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_LEFT);

        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(300);

    }

}
