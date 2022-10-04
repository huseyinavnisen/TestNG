package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBurada_Page {
    public HepsiBurada_Page(){ // constractor
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']")
    public WebElement arama;

    @FindBy(xpath = "//*[@class='searchResultSummaryBar-HM2Hk6FnQ2zwnblc0BJb']")
    public WebElement aramaSonucu;

    @FindBy(xpath = "(//*[text()='Fiyat Aralığı'])[2]")
    public WebElement fiyataraliğiYazisi;



}
