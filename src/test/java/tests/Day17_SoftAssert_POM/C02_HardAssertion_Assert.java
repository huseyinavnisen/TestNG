package tests.Day17_SoftAssert_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_HardAssertion_Assert extends TestBaseBeforeMethodAfterMethod {

    // Hard Assertions : JUNit'te öğrendiğimiz assertion ile aynıdır.
    // Assert.assertTrue();  Assert.assertFalse();  Assert.assertEquals();
    // Hard Assertions'da herhangi bir assertion failed olursa, test method'un çalışmasını durdurur ve
    // kalan kodları yürütmez.(stop execution)



    @Test
    public void test01() {
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        String actalTitle = driver.getTitle();
        Assert.assertTrue(actalTitle.contains("Amazon"));
        //3-arama kutusunun erişilebilir oldugunu tets edin
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //4-arama kutusuna Nuella yazıp aratın
        aramakutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());
        //6-arama sonucunun Nutella içerdigini test edin
        Assert.assertTrue(sonuc.getText().contains("Nutella"));

    }


}
