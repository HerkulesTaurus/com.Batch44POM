package tests.day18;

import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_WebTables {

    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;

    @Test
    public void loginT() {

        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.

        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!
        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();
    }
    @Test
    public void table() {
        //● table( ) metodu oluşturun  //==>>>HMCCWebTablePage sayfa actık orda yaptık
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        // header kisminda birinci satir ve altindaki datalari locate edelim
        //   //thead//tr[1]//th

        HMCWebTablePage hmcWebTablePage = new HMCWebTablePage();
        List<WebElement> headerDataList = hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("tablodaki sutun sayisi :" + headerDataList.size());

        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        //          //tbody

        System.out.println(hmcWebTablePage.tumBodyWebElementi.getText());
        // Eger body yi tek bir weelement olarak locate edersek
        // icindeki tum datalari getText() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil
        // body nin icindeki tek bir string in parcalari olurlar
        // dolayısıyla bu elementlere tek tek ulasmamız mumkun olmaz
        // sadece contains methodu ile body de olup olmadıgını test edebılırız


        // eger her bır datayı ayrı ayrı almak ıstersek

        //   //tbody//td seklinde locate edip bir list'e atabiliriz

        List<WebElement>bodyTumDataList=hmcWebTablePage.tumBodyDatalariList;
        System.out.println("body dekı data lıst"+bodyTumDataList);
        System.out.println("liste elementleri");
    }
       @Test(dependsOnMethods = "loginT")
       public void printRows(){

           //● printRows( ) metodu oluşturun //tr
           //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
           //  //tbody//tr
            hmcWebTablePage=new HMCWebTablePage();
           System.out.println(hmcWebTablePage.satirlarListesi.size());

           //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
           List<WebElement> satirlarWebelemetListesi=hmcWebTablePage.satirlarListesi;
           for (WebElement each: satirlarWebelemetListesi){
               System.out.println(each.getText());
           }

           //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
           System.out.println("4. satir" + satirlarWebelemetListesi.get(3).getText());



    }
}
