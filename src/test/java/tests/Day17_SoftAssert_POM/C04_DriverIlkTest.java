package tests.Day17_SoftAssert_POM;

import org.testng.annotations.Test;
import utilities.Driver;


public class C04_DriverIlkTest  {
// TestBase extens yerine; Driver clasından getDriver() methodunu kullanacağız.
    @Test
    public void test01() {
        Driver.getDriver().get("http://amazon.com"); // driver açaçack
        Driver.getDriver().get("http://bestbuy.com");// aynı driverı kullanacak
        Driver.closeDriver(); // burada kapatacak
        Driver.getDriver().get("http://hepsiburada.com"); // yeni driver açacak
        Driver.closeDriver(); // burada kapatacak
    }


}
