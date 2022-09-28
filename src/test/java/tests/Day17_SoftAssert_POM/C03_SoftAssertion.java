package tests.Day17_SoftAssert_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_SoftAssertion extends TestBaseBeforeMethodAfterMethod {

    // Soft Assert : Kullanabilmek için obje oluştururuz, oluşturduktan sonra obje ismi ile kullanırız,
    // Herhangi bir hata verdiğinde test methodu
    // çalışmaya devam eder, en sonra rapor verir.    baslangıc  SoftAssert objeadı=new SoftAssert();
    // bitis objeadı.assertAll();

    @Test
    public void test01() {
        SoftAssert sofassert=new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        String actalTitle = driver.getTitle();
        sofassert.assertTrue(actalTitle.contains("Hüseyin"),"Başlık Doğru Değil"); // hardsoft olsa durması lazımdı, ama durmaz
        //3-arama kutusunun erişilebilir oldugunu tets edin
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //4-arama kutusuna Nuella yazıp aratın
        aramakutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        sofassert.assertTrue(sonuc.isDisplayed(),"Sonuç WE görülemedi");
        //6-arama sonucunun Nutella içerdigini test edin
        sofassert.assertTrue(sonuc.getText().contains("Çokokrem"),"Nutella İçermiyor");
        sofassert.assertAll();
    }


}
