package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class homework_07  extends BaseTest {
    /*

- https://demoqa.com/select-menu sitesine gidin

- multiple <select> elementini locate edin

- getOptions(), getFirstSelectedOption(), getAllSelected() methodlarini kullanmak adina:

    * Farkli secimler yaparak methodlarinizi kullanin ve Assertion yapmayi unutmayin

     */

    @Test
    public  void test01(){

         driver.get("https://demoqa.com/select-menu");

        WebElement dropDown= driver.findElement(By.id("cars"));

        Select select=new Select(dropDown);

        List<WebElement>listGetOption=select.getOptions();

        for (WebElement list:listGetOption){

            System.out.println(list.getText());
        }
    }
    @Test
    public  void test02(){

        driver.get("https://demoqa.com/select-menu");

        WebElement dropDown= driver.findElement(By.id("cars"));

        Select select=new Select(dropDown);

        select.selectByIndex(1);

        select.selectByIndex(3);

        WebElement getFirstSelectOption= select.getFirstSelectedOption();

        System.out.println(getFirstSelectOption.getText());


    }
    @Test
    public  void test03(){

        driver.get("https://demoqa.com/select-menu");

        WebElement dropDown= driver.findElement(By.id("cars"));

        Select select=new Select(dropDown);

        select.selectByIndex(2);

        List<WebElement>allSelect=select.getAllSelectedOptions();

        allSelect.forEach(x-> System.out.println(x.getText()));

    }
}
