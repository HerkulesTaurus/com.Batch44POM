package tests.day16;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    // Drivwr class ı sayesınde eski driver ==>  "died"
    // artik driver a ihtiyacımız varsa Driver.getDriver() yazacagız

    @Test
    public void test01(){
        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com/");

        // amazona gittigimizi test edelim // driver olmadıgı ıcın Driver class ından get driver ı cagırıyoruz
        String actualTtitle = Driver.getDriver().getTitle();
        String ACTUALUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTtitle.contains("Amazon"));

        // Driver.getDriver method u her calıstıgında
        // driver = new ChromeDriver(); komutundan oturu yenı bır driver olusturuyor
        // Biz Driver class ından getDriver i ilk calıstırdıgımızdan new atamasi olsun
        // sonraki calıstırmalarda atama olmasın ıstıyoruz
        // bunun icin driver = new ChromeDriver(); satiri bir if blogu ıcıne alacagız
        Driver.closeDriver();
    }

    @Test
    public void test02(){
        // bestbuy anasayfaya gıdelım
        Driver.getDriver().get("https://www.bestbuy.com");

        // bestbuy a gıttıgımızı test edelım

        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }

}
