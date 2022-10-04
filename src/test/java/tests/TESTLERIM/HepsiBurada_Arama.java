package tests.TESTLERIM;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HepsiBurada_Page;
import utilities.ConfigReader;
import utilities.Driver;
import java.io.IOException;

public class HepsiBurada_Arama {
    HepsiBurada_Page hepsiburada = new HepsiBurada_Page();

    @Test(groups = {"hepsiburada","arama"})
    public void hepsiburada_arama() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("hbUrl"));
        hepsiburada.arama.sendKeys("tablet",Keys.ENTER);
        Assert.assertTrue(hepsiburada.fiyataraliğiYazisi.isDisplayed());
    }
}
