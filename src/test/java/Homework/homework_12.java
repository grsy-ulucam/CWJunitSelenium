package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class homework_12 extends BaseTest {
    @Override
    public void tearDown() {
        //super.tearDown();
    }

    @Test
    public void  test01(){
      /*
   Go to URL: https://the-internet.herokuapp.com/dropdown

Create method selectByIndexTest and Select Option 1 using index .

Create method selectByValueTest Select Option 2 by value.

Create method selectByVisibleTextTest Select Option 1 value by visible text.

Create method printAllTest Print all dropdown value.

Verify the dropdown has Option 2 text.

Create method printFirstSelectedOptionTest Print first selected option.

Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

     */

    driver.get("https://the-internet.herokuapp.com/dropdown ");

    WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown']"));

    dropDown.click();

    Select select=new Select(dropDown);

    List<WebElement>list=select.getOptions();

    select.selectByIndex(1);

    select.selectByValue("2");


    select.selectByVisibleText("Option 1");

    for (WebElement w:list){
        System.out.println(w.getText());
        System.out.println(w.getText().contains("Option 2"));

    }

    WebElement option2=select.getFirstSelectedOption();

    System.out.println(option2.getText());

    int expect=3;

    int actual= list.size();

    Assert.assertEquals("Expected Is Not Equal Actual",expect,actual);
}

}
