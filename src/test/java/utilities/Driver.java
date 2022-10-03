package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
public class Driver {
    private Driver(){ // getDriver() methoduna ulaşılasın singlepatern olsun diye private yaptık. isteğe bağlı
    }
    static WebDriver driver;
    public static WebDriver getDriver() {
        // testi her çalıştırdığında her sefer yeni driver açmasın, hepsi için tek driverda tüm
        // işlmleri yapsın diye kontrol koyduk
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "headless-chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            } // case sonu

        } // if sonu
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;

    }
    public static void closeDriver() {
        if (driver!= null) {
            driver.close();
            driver=null; // kapandıktan sonra, yeni driver açmalarda getDriver methodunun doğru çalışması için
        }
    }

    public static void quitDriver() {
        if (driver!= null) {
            driver.quit();
            driver=null;
        }
    }

}
