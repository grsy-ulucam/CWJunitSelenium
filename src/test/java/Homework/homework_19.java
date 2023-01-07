package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class homework_19 extends BaseTest {
    @Override
    public void tearDown() {
        // super.tearDown();
    }

    @Test
    public void amazon() {

        //o https://www.amazon.com.tr/ sitesi açılır.

        driver.get("https://www.amazon.com.tr/");

        //o Ana sayfanın açıldığı kontrol edilir.

        String currentURL = driver.getCurrentUrl();

        Assert.assertTrue("url amazon içermiyor", currentURL.contains("amazon"));

        //o  Çerez tercihlerinden Çerezleri kabul et seçilir.

        WebElement acceptCookie = driver.findElement(By.id("sp-cc-accept"));

        acceptCookie.click();

        // o  Siteye login olunur.

        WebElement hesaplar = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        hesaplar.click();


        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        String mail = "......@gmail.com";

        String mailPassword = ".......";

        emailInput.sendKeys(mail + Keys.ENTER);

        Actions actions = new Actions(driver);

        actions.sendKeys(mailPassword).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


        //o Login işlemi kontrol edilir.

        WebElement logControl = driver.findElement(By.cssSelector("[class=\"nav-line-1-container\"]"));

        Assert.assertTrue(logControl.isDisplayed());


        //o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
        WebElement aramaButonu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select = new Select(aramaButonu);
        select.selectByValue("search-alias=computers");

        //o Bilgisayar kategorisi seçildiği kontrol edilir.
        Assert.assertTrue(aramaButonu.getText().contains("Bilgisayarlar"));

        //o Arama alanına MSI yazılır ve arama yapılır.

        WebElement mlsLctd = driver.findElement(By.id("twotabsearchtextbox"));
        actions.click(mlsLctd).sendKeys("MSI").sendKeys(Keys.ENTER).perform();

        // o Arama yapıldığı kontrol edilir.
        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println(result.getText());
        Assert.assertTrue(result.getText().contains("MSI"));

        // o Arama sonuçları sayfasından 2. sayfa açılır.
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement page2 = driver.findElement(By.cssSelector("[aria-label=\"2 sayfasına git\"]"));

        actions.click(page2).perform();

        // o 2. sayfanın açıldığı kontrol edilir.

        Assert.assertTrue(driver.findElement(By.linkText("2")).isDisplayed());

        // o Sayfadaki 2. ürün favorilere eklenir.

        WebElement productTwoSelect = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[2]"));

        productTwoSelect.click();

        WebElement listAdd = driver.findElement(By.id("wishListMainButton"));

        listAdd.click();

        // o 2. Ürünün favorilere eklendiği kontrol edilir.

        WebElement listGoruntuleme=driver.findElement(By.xpath("//a[.='Listenizi Görüntüleyin']"));

        listGoruntuleme.click();

        WebElement listedeurunVarmı = driver.findElement(By.xpath("(//div[@class=\"a-fixed-left-grid-col g-item-sortable-draggable-area a-col-left\"])[1]"));

        Assert.assertTrue(listedeurunVarmı.isDisplayed());

        // o Hesabım > Favori Listem sayfasına gidilir.

        actions.moveToElement(hesaplar).build();

        WebElement lıste=driver.findElement(By.xpath("//span[.='Alışveriş Listesi']"));

        lıste.click();



        // o “Favori Listem” sayfası açıldığı kontrol edilir.

        WebElement kaldırButonu=driver.findElement(By.name("submit.deleteItem"));
        Assert.assertTrue(kaldırButonu.isDisplayed());


        //o Eklenen ürün favorilerden silinir.
        actions.click(kaldırButonu).perform();


        // o Silme işleminin gerçekleştiği kontrol edilir.

        WebElement silindimi=driver.findElement(By.xpath("//div[@id=\"wl-item-view\"]"));

        Assert.assertTrue(silindimi.isDisplayed());

        // o Üye çıkış işlemi yapılır.

        WebElement hesaplarVeList=driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav-link-accountList\"]"));

        actions.moveToElement(hesaplarVeList).perform();

        WebElement  cıkısYap=driver.findElement(By.xpath("//span[.='Çıkış Yap']"));

        cıkısYap.click();

        // o Çıkış işleminin yapıldığı kontrol edilir.

        Assert.assertEquals("Amazon Giriş Yap",driver.getTitle());


    }
}
