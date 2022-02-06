package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {

    // POM da(pageObjectModel) farklı claslara farklı sekılde ulasılması benımsenmıstır
    // Driver class i icin static yontemi kullanıyoruz
    // Page Class lari icin ise obje uzerınden kullanılması tercıh edilmistir
    @Test
    public void test01(){
        // Amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com/");

        // arama kutusuna "nutella" yazalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        // Arama sonuclarının "nutella" icerdigini test edelim
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("nutella"));

        Driver.closeDriver();
    }

    @Test
    public void test02(){
        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // "java" icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java"+Keys.ENTER);

        // sonucun java icerdigini test edelim
        String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();

        Assert.assertTrue(sonucYazisiStr.contains("java"));
        Driver.closeDriver();
    }

}
