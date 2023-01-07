package Homework;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

public class homework_10 extends BaseTest {

    /*
    Go to URL: https://testproject.io/
    Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page
   https://blog.testproject.io/
     */

    @Test
    public  void  test01(){

       driver.get("https://testproject.io/");

       String homePageHandle= driver.getWindowHandle();

       WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);

       newWindow.get("https://blog.testproject.io/");

    }
}
