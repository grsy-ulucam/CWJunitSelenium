package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class homework_11  extends BaseTest {
/*
 Go to URL: http://demo.guru99.com/test/guru99home/
    Find the number of iframes on the page.
    Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
    Exit the iframe and return to the main page.
 */

    @Override
    public void tearDown() {
        //super.tearDown();
    }

    @Test
public void iframe(){

    driver.get("http://demo.guru99.com/test/guru99home/");

    List<WebElement> linkList = driver.findElements(By.xpath("//iframe"));

    System.out.println(linkList.size());

    driver.switchTo().frame("a077aa5e");

   driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();



    driver.switchTo().defaultContent();




}




}
