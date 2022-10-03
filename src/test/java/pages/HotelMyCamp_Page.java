package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp_Page {
    public HotelMyCamp_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath="//*[text()='Log in']")
    public WebElement login;

    @FindBy (xpath="//*[@id='UserName']")
    public WebElement username;

    @FindBy (xpath="//*[@id='Password']")
    public WebElement pasword;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//a[@id='menuHotels']")
    public WebElement hotelManagement;

    @FindBy(xpath = "(//a[@href='/admin/RoomReservationAdmin'])[1]")
    public WebElement roomReservation;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addRoom;

    @FindBy (xpath= "//select[@id='IDUser']")
    public WebElement idUser;

    @FindBy (xpath = "//select[@id='IDHotelRoom']")
    public WebElement hotelRoom;

    @FindBy (xpath= "//div[@class='bootbox-body']")
    public WebElement roomReservationText;

    @FindBy (xpath = "//button[@data-bb-handler='ok']")
    public WebElement okButton;


}
