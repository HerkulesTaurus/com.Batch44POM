package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // bir page class ı actıgımızda ilk yapmamız gereken sey
    // parametresiz bir constructor olusturup
    // bu constructor icinde PageFactory ile driver a ilk deger atamasını yapmak olmalıdır.

    public AmazonPage(){   // paramaetresiz constructor olusturduk
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;


    @FindBy(xpath ="//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;

}
