package tests.Day18_POM;

import org.testng.annotations.Test;
import utilities.Driver;

public class P02_Configuration_Properties {

    @Test
    public void test01() {
        Driver.getDriver().get("amzUrl");
    }
}
