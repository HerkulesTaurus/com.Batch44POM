package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebtableDinamikLocate {

    // 3 test method'u olusturalim;


    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
    // 1. Method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

            // 2. satiri yazdir   //tbody//tr[2]
            // 7. satiri yazdir   //tbody//tr[7]

        hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncusatirElementi=hmcWebTablePage.satirGetir(3);

        System.out.println(ucuncusatirElementi.getText());

        Driver.closeDriver();
}

    @Test
    public void hucreGetirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        // 2. Method satir no ve data numarasi girdigimde verdigim datayi yazdirsin

        hmcWebTablePage=new HMCWebTablePage();

        // 2. satirin 4. datasi  //tbody//tr[2]//td[4]
        // 4. satirin 5. datasi  //tbody//tr[4]//td[5]

        System.out.println("girdiginiz hucredekı element :" + hmcWebTablePage.hucreWebelementGetir(5,3));
        Driver.closeDriver();

    }

@Test
    public void sutunYazdirTesti(){
    hotelMyCampPage=new HotelMyCampPage();
    hotelMyCampPage.girisYap();

    // 3. Sutun numarasi verdigimde bana tum sutunu yazdirsin
    hmcWebTablePage=new HMCWebTablePage();
    hmcWebTablePage.sutunYazdir(4);

    Driver.closeDriver();


}













}
