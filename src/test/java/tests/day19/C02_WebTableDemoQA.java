package tests.day19;

import org.testng.annotations.Test;
import pages.DemoQAPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoQA {

@Test
    public void demoQATest(){

    // Bir Class olusturun D19_WebtablesHomework
    //  1. “https://demoqa.com/webtables” sayfasina gidin
    Driver.getDriver().get(ConfigReader.getProperty("DemoQAUrl"));

    DemoQAPage demoQAPage=new DemoQAPage();
    //  2. Headers da bulunan department isimlerini yazdirin
    //  normalde //thead//th olurdu ancak bu tablo class isimleri ile organize edilmis
    System.out.println("Baslik Satiri Elementi : "+demoQAPage.baslikSatiriElementi.getText());

    //==> ikinci bir yontem olarak basliklari bir listeye koyabilirim
    // basliklarWebElementListesi

    //  3. sutunun basligini yazdirin
    System.out.println("3.sutun baslıgı"+demoQAPage.basliklarWebelementiListesi.get(2).getText());

    //  4. Tablodaki tum datalari yazdirin
    System.out.println(demoQAPage.bodyTekWebELement.getText());

    //  5. Tabloda kac cell (data) oldugunu yazdirin
    System.out.println("tablodaki data sayisi :"+demoQAPage.tumDataWebElementList.size());

    //  6. Tablodaki satir sayisini yazdirin
    System.out.println("tum satir sayisi :" + demoQAPage.tumSatirlarWebElementiList.size());

    //  7. Tablodaki sutun sayisini yazdirin
    // farklı yollardan hesaplanabilir ama bşz hucresayisi/satir sayisi yapalim
    System.out.println("Tablodaki sutun sayisi :" +
            (demoQAPage.tumDataWebElementList.size()/demoQAPage.tumSatirlarWebElementiList.size()));

    //  8. Tablodaki 3.kolonu yazdirin
    demoQAPage.sutunYazdir(3);


    //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
    demoQAPage.ismeGoreMaasYazdir("Kierra");

    // 10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

    demoQAPage.hucreYazdir(2,3);

    Driver.closeDriver();
}



}
