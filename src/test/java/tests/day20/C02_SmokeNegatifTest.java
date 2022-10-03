package tests.day20;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNegatifTest {
    @Test
    public void yanlisKullanici() { // 1.Senoryo: yanlış kullanıcı, doğru şifre

        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HotelMyCamp_Page HotelMyCamp_Page = new HotelMyCamp_Page();
        //login butonuna bas
        HotelMyCamp_Page.login.click();
        //test data username: manager1 ,  test data password : manager1!
        HotelMyCamp_Page.username.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(HotelMyCamp_Page.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }

    @Test
    public void yanlisSifre() { //2.Seneryo: Doğru kullanıcı, Yanlış Şifre

        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HotelMyCamp_Page HotelMyCamp_Page = new HotelMyCamp_Page();
        //login butonuna bas
        HotelMyCamp_Page.login.click();
        //test data username: manager1 ,  test data password : manager1!
        HotelMyCamp_Page.username.sendKeys(ConfigReader.getProperty("user"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(HotelMyCamp_Page.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();

    }

    @Test
    public void yanlisKullaniciSifre() { // 3. Senoryo: Yanlış kullanıcı, Yanlış şifre
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HotelMyCamp_Page HotelMyCamp_Page = new HotelMyCamp_Page();
        //login butonuna bas
        HotelMyCamp_Page.login.click();
        //test data username: manager1 ,  test data password : manager1!
        HotelMyCamp_Page.username.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(HotelMyCamp_Page.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }
}
