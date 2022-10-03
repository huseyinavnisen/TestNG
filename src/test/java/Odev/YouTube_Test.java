package Odev;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YouTube_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

public class YouTube_Test extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test1() {

        // https://www.youtube.com adresine gidin
         Driver.getDriver().get(ConfigReader.getProperty("ytbUrl"));
        YouTube_Page youtube = new YouTube_Page();

        // Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        // titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.equals("YouTube"));
        // imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        youtube.ytblogo.isDisplayed();
        // Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        Assert.assertTrue(youtube.ytbArama.isEnabled());
        // wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertFalse(title.equals("youtube"));
    }
}
