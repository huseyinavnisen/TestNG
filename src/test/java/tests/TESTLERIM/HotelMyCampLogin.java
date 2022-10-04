package tests.TESTLERIM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampLogin {
    @Test (groups = {"login","hotel"})
    public void hotel_login() {
        //https://www.hotelmycamp.com/ adresine git login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        HotelMyCamp_Page hmcPage = new HotelMyCamp_Page();

        hmcPage.login.click();
        //test data username: manager,
        // test data password : Manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("passWord"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.girisYapildi.isDisplayed());
        Driver.closeDriver();


    }
}
