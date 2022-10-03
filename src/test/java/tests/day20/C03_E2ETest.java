package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2ETest {
    @Test
    public void E2ETest() throws InterruptedException {
        //https://www.hotelmycamp.com adresine git.
         Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
         HotelMyCamp_Page HotelMyCamp_Page = new HotelMyCamp_Page();
         HotelMyCamp_Page.login.click();
        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        //Login butonuna tıklayın.
        HotelMyCamp_Page.username.sendKeys(ConfigReader.getProperty("user"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();
        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        HotelMyCamp_Page.hotelManagement.click();
        Thread.sleep(2000);
        HotelMyCamp_Page.roomReservation.click();
        Thread.sleep(2000);
        HotelMyCamp_Page.addRoom.click();
        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //Save butonuna tıklayın.
        Faker faker = new Faker();
        HotelMyCamp_Page.idUser.sendKeys("manager");
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel").
                sendKeys(Keys.TAB).sendKeys("1500").sendKeys(Keys.TAB).sendKeys("10/02/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).sendKeys("skajdlaksjdaasd")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(3000);
        Assert.assertTrue(HotelMyCamp_Page.roomReservationText.isDisplayed());
        //OK butonuna tıklayın.
        HotelMyCamp_Page.okButton.click();

    }
}
