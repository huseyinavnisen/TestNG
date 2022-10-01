package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Facebook_Page {

   public Facebook_Page(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
    //email
    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    //sifre
    @FindBy(xpath = "//*[@id='pass']")
    public WebElement sifre;

    //Giris
    @FindBy(xpath = "//*[@name='login']")
    public WebElement giris;

    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement hataliGiris;

    // ccokies
    @FindBy(xpath = "//button[text()='Allow essential and optional cookies']")
    public WebElement cookies;
}
