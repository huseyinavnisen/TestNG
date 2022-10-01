package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class Saucedemo_Page {
    public Saucedemo_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement pasword;
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement login;
    @FindBy(xpath = "//option[@value='lohi']")
    public WebElement lohi;



}

