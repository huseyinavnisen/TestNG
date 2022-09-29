package tests.Practise05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test1() {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Hüseyin");
        //fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("ŞEN");
        //check the gender
        driver.findElement(By.xpath("//*[@id='sex-0']")).click();
        //check the experience
        driver.findElement(By.xpath("//*[@id='exp-0']")).click();
        //fill the date
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("13.08.2022");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        //choose your continent -> Antartica
        WebElement dropDownContinent = driver.findElement(By.xpath("//*[@id='continents']"));
        Select select = new Select(dropDownContinent);
        select.selectByVisibleText("Antartica");
            // 2. yol; ama hata olabilir
            //  driver.findElement(By.xpath("//*[@id='continents']")).sendKeys("Antartica");

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("(//select[@id='selenium_commands']/option)[1]")).click();
        //click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();

    }


}
