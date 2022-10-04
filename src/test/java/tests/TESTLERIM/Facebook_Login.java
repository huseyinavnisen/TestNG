package tests.TESTLERIM;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Facebook_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class Facebook_Login {

    @Test(groups = {"login","facebook"})
    public void facebook_login() {
        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        // POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        Facebook_Page facebookPage=new Facebook_Page();
        // Faker class’ini kullanarak email ve sifre degerlerini
        Faker faker=new Faker();
        String mail=faker.internet().emailAddress();
        String sifre=faker.internet().password();
        facebookPage.email.sendKeys(mail);
        facebookPage.sifre.sendKeys(sifre);
        System.out.println("mail = " + mail);
        System.out.println("sifre = " + sifre);

        // girip, giris butonuna basin
        facebookPage.giris.click();
        // Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.hataliGiris.isDisplayed());

    }


}
