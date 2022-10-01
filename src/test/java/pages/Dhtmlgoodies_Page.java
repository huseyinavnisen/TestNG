package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dhtmlgoodies_Page {
    public Dhtmlgoodies_Page(){ // constractor
        PageFactory.initElements(Driver.getDriver(),this);
    }
// başkentler
    @FindBy (xpath="//div[@id='box1']")
    public WebElement oslo;
    @FindBy (xpath="//div[@id='box2']")
    public WebElement stockholm;
    @FindBy (xpath="//div[@id='box3']")
    public WebElement washington;
    @FindBy (xpath="//div[@id='box4']")
    public WebElement copenhagen;
    @FindBy (xpath="//div[@id='box5']")
    public WebElement seoul;
    @FindBy (xpath="//div[@id='box6']")
    public WebElement rome;
    @FindBy (xpath="//div[@id='box7']")
    public WebElement madrid;

    // ülkeler
    @FindBy (xpath="//div[@id='box106']")
    public WebElement italy;
    @FindBy (xpath="//div[@id='box107']")
    public WebElement spain;
    @FindBy (xpath="//div[@id='box101']")
    public WebElement norway;
    @FindBy (xpath="//div[@id='box104']")
    public WebElement denmark;
    @FindBy (xpath="//div[@id='box105']")
    public WebElement soutkorea;
    @FindBy (xpath="//div[@id='box102']")
    public WebElement sweden;
    @FindBy (xpath="//div[@id='box103']")
    public WebElement usa;

}