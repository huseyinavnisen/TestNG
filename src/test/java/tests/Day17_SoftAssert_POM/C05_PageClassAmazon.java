package tests.Day17_SoftAssert_POM;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;


public class C05_PageClassAmazon {

    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get("https://amazon.com");
        amazonPage.aramaKutusu.sendKeys("oyuncak", Keys.ENTER);
        System.out.println("amazonPage.aramaSonucElementi.getText() = " + amazonPage.aramaSonucElementi.getText());

    }


}
