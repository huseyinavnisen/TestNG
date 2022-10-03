package Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazon_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Amazon_Nutella_Test extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test1() {
        // https://www.amazon.com/ adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("amzUrl"));
        Driver.getDriver().navigate().refresh();
        Amazon_Page amazon = new Amazon_Page();
        // Test : Amazon ana sayfaya gittiginizi test edin
        Assert.assertTrue(amazon.aramaKutusu.isDisplayed());
        // Nutella aratın
        amazon.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        // Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        String aramasonucu = amazon.aramaSonucElementi.toString();
        Assert.assertTrue(aramasonucu.contains("Nutella"));
        // $16.83 oldugunu test edin
        driver.findElement(By.xpath("(//*[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-3'])[1] ")).click();


    }


}





