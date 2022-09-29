package SoruBankasi;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class S01_AmazondaVerilerAramaExceleAktarma {
    String tarih;

    @Test
    public void test01() throws IOException, InterruptedException {


        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("YYMMddHHmm");
        // DateTimeFormatter formater = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formater);


        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().navigate().refresh();


        String dosyaYolu = "src/resources/amazonsearch.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        int sonsatir = workbook.getSheet("Sheet1").getLastRowNum();
        System.out.println("sonsatir = " + sonsatir);

        for (int i = 1; i <= sonsatir; i++) {
            amazonPage.aramaKutusu.clear();
            String arananUrun = workbook.getSheet("Sheet1").getRow(i).getCell(0).toString();
            amazonPage.aramaKutusu.sendKeys(arananUrun, Keys.ENTER);
            System.out.println(amazonPage.aramaSonucElementi.getText());
            workbook.getSheet("Sheet1").getRow(i).createCell(1).setCellValue(amazonPage.aramaSonucElementi.getText());

            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File tumSayfaResmi = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(tumSayfaResmi, new File("target/screenShot/" + tarih +i+".jpeg"));
            workbook.getSheet("Sheet1").getRow(i).createCell(2).setCellValue("target/screenShot/" + tarih +i+".jpeg");




        }

        FileOutputStream fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);
        fis.close();
        fos.close();
        workbook.close();

    }
}
