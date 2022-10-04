package Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazon_Page;
import pages.HepsiBurada_Page;
import utilities.ConfigReader;
import utilities.Driver;


public class HepsiBurada_Test {
    HepsiBurada_Page hb = new HepsiBurada_Page();

    @Test(groups = {"hepsiburada","arama"})
    public void hepsiburada_arama() {
        Driver.getDriver().get(ConfigReader.getProperty("hbUrl"));
        hb.arama.sendKeys("tablet", Keys.ENTER);
        Assert.assertTrue(hb.aramaSonucu.isDisplayed());

    }


}





