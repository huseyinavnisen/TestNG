package tests.Odev;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Saucedemo_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

public class saucedemo_test extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test1() {

        //     * Navigate to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("sauceUrl"));
        Saucedemo_Page saucedemo = new Saucedemo_Page();
        //     * Enter the username  as standard_user
        saucedemo.userName.sendKeys("standard_user");
        //     * Enter the password as   secret_sauce
        saucedemo.pasword.sendKeys("secret_sauce");
        //     * Click on login button
        saucedemo.login.click();
        //     * Choose price low to high
        saucedemo.lohi.click();
        //       and verify that PRICE (LOW TO HIGH) is visible
        Assert.assertTrue(saucedemo.lohi.isDisplayed());

    }
}