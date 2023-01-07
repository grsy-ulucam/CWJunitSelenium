package Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise_01 {
    // Set Path.
// Create chrome driver.
// Maximize the window.
// Open google home page https://www.google.com/
// Verify that you are Google in the title.
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        String title= driver.getTitle();

        if (title.equals("Google")){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAİLED");
        }
        driver.quit();

    }


}
