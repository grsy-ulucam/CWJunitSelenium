package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class homework_20 extends BaseTest {

    @Override
    public void tearDown() {
        // super.tearDown();
    }

    @Test
    public void name() {

        // Case1: Positive Login Test

        //Open page https://practicetestautomation.com/practice-test-login/

        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

        username.sendKeys("student");

        //Type password Password123 into Password

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        password.sendKeys("Password123");

        //Puch Submit button.

        WebElement submit = driver.findElement(By.className("btn"));

        submit.click();

        // Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("practicetestautomation.com/logged-in-successfully/"));


        // Verify new page contains expected text ('Congratulations' or 'successfully logged in')

        WebElement succesfully = driver.findElement(By.className("post-title"));

        Assert.assertTrue(succesfully.getText().contains("Successfully"));

        // Verify button Log out is displayed on the new page.

        WebElement logoutButton = driver.findElement(By.xpath("//a[.='Log out']"));

        Assert.assertTrue(logoutButton.isDisplayed());


    }


}
