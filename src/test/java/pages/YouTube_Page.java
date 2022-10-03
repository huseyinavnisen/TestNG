package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YouTube_Page {
    public YouTube_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@id='logo-icon'])[1]")
    public WebElement ytblogo;
    @FindBy(xpath = "(//*[@id='search'])[3]")
    public WebElement ytbArama;






}
