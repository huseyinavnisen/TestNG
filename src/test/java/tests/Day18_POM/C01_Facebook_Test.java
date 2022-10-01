package tests.Day18_POM;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Facebook_Page;
import utilities.Driver;

public class C01_Facebook_Test {
    @Test
    public void test1() {
        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
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
