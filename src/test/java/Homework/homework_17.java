package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class homework_17 extends BaseTest {

    @Override
    public void tearDown() {
        super.tearDown();
    }
    /*
 Go to URL: https://the-internet.herokuapp.com/tables

Print the entire table

Print All Rows

Print Last row data only

Print column 5 data in the table body

Write a method that accepts 2 parameters

parameter 1 = row number

parameter 2 = column number

printData(3,4); => prints

parameter 3 = table id

printData(3,4,"table1") => prints data in 3rd row 4th Column with table id

         */



    @Test
    public void name() {



        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));

        System.out.println(table.getText());

        int rowSize = table.findElements(By.xpath(".//tr")).size();

        System.out.println("rowSize = " + rowSize);

        for (int i = 2; i < rowSize; i++) {

            System.out.println(table.findElement(By.xpath(".//tr[" + i + "]")).getText());

        }

        System.out.println("sadece body yazdırıldı");

        WebElement body = driver.findElement(By.tagName("tbody"));

        System.out.println(body.getText());

        // Print column 5 data in the table body


        for (int i = 1; i < rowSize; i++) {

            System.out.println(table.findElement(By.xpath(".//tr[" + i + "]//td[5]")).getText());

            printData1(3, 4, table);

            printData(3, 4);

        }
    }

    public void printData(int satir, int sutun) {

        WebElement table = driver.findElement(By.id("table1"));

        System.out.println(table.findElement(By.xpath(".//tr[" + satir + "]//td[" + sutun + "]")).getText());

    }

    public void printData1(int satir, int sutun, WebElement table) {

        System.out.println(table.findElement(By.xpath(".//tr[" + satir + "]//td[" + sutun + "]")).getText());

    }


}
