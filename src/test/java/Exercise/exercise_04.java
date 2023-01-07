package Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class exercise_04 {

    WebDriver driver;

    @Before
    public  void setup(){
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://tr.linkedin.com/");

        driver.manage().window().maximize();
    }

     @After
    public void tearDown(){
        driver.quit();
     }

     @Test
    public void idLocator(){
        WebElement email= driver.findElement(By.id("session_key"));
        email.sendKeys("tekrardan selamlar");
     }
    @Test
    public void nameLocator(){
        WebElement password= driver.findElement(By.name("session_password"));
        password.sendKeys("şifre");
    }
    @Test
    public void classLocator(){
        WebElement email= driver.findElement(By.className("input__input"));
        email.sendKeys("Class locator test");
    }
    @Test
    public void tagLocator(){

        List<WebElement> emailList = driver.findElements(By.tagName("input"));

        WebElement email=emailList.get(1);

        email.sendKeys("tag locator test");
    }
    @Test
    public void linkTextLocator(){


        WebElement forgotPwd=driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));

        forgotPwd.click();
    }

     @Test
    public void  absoluteXpath(){
                    WebElement email=driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/div[1]/input"));
                    email.sendKeys("xpath başarılıdır");

     }
    @Test
    public void  relativeXpath(){
        WebElement email=driver.findElement(By.xpath("//input[@name='session_key']"));
        email.sendKeys("relative xpath başarılıdır");

    }
    @Test
    public  void multipleAttributeXpath(){

        WebElement email=driver.findElement(By.xpath("//input[@class='input__input'][@name='session_key']"));
        email.sendKeys("multipleAttributeXpath başarılı");
    }

    @Test
    public void andOrXpath(){
        WebElement email= driver.findElement(By.xpath("//input[@class='input__input' and @name='session_key']"));
      email.sendKeys("gayet başarılı andOrXpath");
    }
    @Test
    public void containsXpath(){

        WebElement email= driver.findElement(By.xpath("//input[contains(@name,'key')]"));
        email.sendKeys("containsxpath gayet iyi ....");
    }


}
