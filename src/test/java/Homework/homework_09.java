package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class homework_09 extends BaseTest {
    @Override
    public void tearDown() {
        super.tearDown();
    }
/*
Go to URL: https://demoqa.com/browser-windows

Click on the windows - "WindowButton"

Click on all the child windows.

Print the text present on all the child windows in the console.

Print the heading of the parent window in the console.

 */


    @Test
    public void test01() {

        driver.get("https://demoqa.com/browser-windows");

        String homePageId = driver.getWindowHandle();


        driver.findElement(By.id("tabButton"));


        driver.findElement(By.xpath("//button[@id='windowButton']")).click();


        Set<String> windows = driver.getWindowHandles();

        Iterator<String> i = windows.iterator();

        while (i.hasNext()) {

            driver.switchTo().window(i.next());

            if (driver.getWindowHandle().equals(homePageId)) {
                continue;
            }
            System.out.println(driver.findElement(By.tagName("body")).getText());
        }
        driver.switchTo().window(homePageId);

        System.out.println(driver.getTitle());


    }

}
