package Homework;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;
public class homework_08 extends BaseTest {
/*
Go to URL: https://opensource-demo.orangehrmlive.com/
Login with Username: Admin
Login with Password: admin123
Click login button
Click on PIM
Click on Employee List
    Employee Name -> Use Faker Class
    ID -> Use Faker Class
    Employment Status -> select by index: 2
    Include -> selectByVisibleText: Current and Past Employees
    Supervisor Name -> Use Faker Class
    Job Title ->selectByValue: IT Manager
    Sub Unit ->selectByValue: 3
Click search button
Verify text visible : "No Records Found"
 */

    @Override
    public void tearDown() {
        //super.tearDown();
    }

    @Test
    public void test01(){
        Faker faker=new Faker();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));

        userName.sendKeys("Admin");

        WebElement passWord= driver.findElement(By.xpath("//input[@name='password']"));

        passWord.sendKeys("admin123");

        WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));

        login.click();

        WebElement pm=driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]"));

        pm.click();

        WebElement employeeList=driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and text()='Employee List']"));

        employeeList.click();

        WebElement emplyname=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));

        emplyname.sendKeys(faker.name().firstName());

        WebElement emplyID=driver.findElement(By.xpath("((//div[@class='oxd-table-filter']//input)[2])"));

        emplyID.sendKeys(faker.idNumber().valid());

        WebElement emplySupervisor=driver.findElement(By.xpath("((//div[@class='oxd-table-filter']//input)[3])"));

        emplySupervisor.sendKeys(faker.name().fullName());

        WebElement searchButton=driver.findElement(By.xpath("//button[@type='submit']"));

        searchButton.click();

        WebElement noRecordText = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]"));

        Assert.assertTrue(noRecordText.isDisplayed());











    }
}