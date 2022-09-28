package tests.Day17_SoftAssert_POM;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_DependsOnMethods extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        driver.get("https://wamazon1.com"); //wamazon u bulamaz
    }

    @Test(dependsOnMethods = "test01") // test01 çalışmadığı için burada çalışmaz
    public void test02() {
        driver.get("https://www.facebook.com");
    }
    @Test (dependsOnMethods = "test02") // test02 çalışmadığı için burada çalışmaz
    public void test03() {
        driver.get("https://bestbuy.com");
    }
    @Test (priority = -2)
    public void test04() {
        driver.get("https://www.youtube.com");
    }
}
