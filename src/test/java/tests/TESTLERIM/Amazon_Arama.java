package tests.TESTLERIM;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.Amazon_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Amazon_Arama {
    Amazon_Page amazonpage = new Amazon_Page();

    @Test(groups = {"amazon","arama"})
    public void amazon_excel_arama() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("amzUrl"));
        Driver.getDriver().navigate().refresh();
        // String projeDosyaYolu = System.getProperty("user.dir");

        String excelDosyaYolu = "src/resources/amazonsearch.xlsx";
        FileInputStream fis = new FileInputStream(excelDosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        int sonsatir = workbook.getSheet("Sheet1").getLastRowNum();
        System.out.println("sonsatir = " + sonsatir);

        for (int i = 1; i <= sonsatir; i++) {
            amazonpage.aramaKutusu.clear();
            String arananUrun = workbook.getSheet("Sheet1").getRow(i).getCell(0).toString();
            amazonpage.aramaKutusu.sendKeys(arananUrun, Keys.ENTER);
            String aramaSonucu = amazonpage.aramaSonucElementi.getText();
            workbook.getSheet("Sheet1").getRow(i).createCell(1).setCellValue(aramaSonucu);

            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File sayfaResmi = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sayfaResmi,new File("target/screenShot/amazon/" + arananUrun + ".jpeg"));
            workbook.getSheet("Sheet1").getRow(i).createCell(2).setCellValue("target/screenShot/amazon/" + arananUrun + ".jpeg");
        }

        FileOutputStream fos = new FileOutputStream(excelDosyaYolu);
        workbook.write(fos);
        fis.close();
        fos.close();
        workbook.close();
    }
}
