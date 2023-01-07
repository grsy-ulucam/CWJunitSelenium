package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

public class homework_14  extends BaseTest {

    @Override
    public void tearDown() {

    }

    @Test
    public void name() {
        //Go to URL: http://facebook.com

        driver.get("http://facebook.com");

        //getCookies,

        Set<Cookie>allCookies=driver.manage().getCookies();

        int numOfCookies=allCookies.size();

        System.out.println("numOfCookies "+numOfCookies);

        //addCookie,

        Cookie cookie=new Cookie("oku","adam ol");

        driver.manage().addCookie(cookie);

        Assert.assertEquals("not matcch",cookie.getValue(),driver.manage().getCookieNamed(cookie.getName()).getValue());

        //deleteCookieNamed,
        driver.manage().deleteCookieNamed(cookie.getName());

        //deleteAllCookies

        driver.manage().deleteAllCookies();

        allCookies=driver.manage().getCookies();

        System.out.println("allCookies size "+allCookies.size());

    }
}
