package tests.Day18_POM;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_Configuration_Properties {

    @Test(groups = "grup1")
    public void test01() throws InterruptedException {
       // amazon ve facebooka gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amzUrl"));
        Thread.sleep(2000); // "Kör bile göreyim demiş". Görelim diye 2 sn beklettik :)
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
    }
}
