package tests.Day16_Priority_Depends;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C04_Priority_Oncelik extends TestBaseBeforeMethodAfterMethod {

    @Test (priority = -6)
    public void amazonTesti() {
        driver.get("https://amazon.com");
    }

    @Test(priority = -4)
    public void bestbuyTesti() {
        driver.get("https://bestbuy.com");
    }
    @Test(priority = 1)
    public void techProTesti() {
        driver.get("https://techproeducation.com");
    }
}
