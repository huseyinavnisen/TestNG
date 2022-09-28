package tests.Day16_Priority_Depends;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void amazonTesti() {
        driver.get("https://amazon.com");
    }

    @Test
    public void bestbuyTesti() {
        driver.get("https://bestbuy.com");
    }
    @Test
    public void techProTesti() {
        driver.get("https://techproeducation.com");
    }
}
