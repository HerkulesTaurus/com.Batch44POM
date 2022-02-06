package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPattern {

    @Test
    public void test01(){

        // singleton Pattern : bir class dan bırden fazla obje uretilmesine izin vermeyen
        // bir pattern olarak kabul gormustur

        // biz driver class'ini driver uretmek uzere kullaniyoruz
        // ancak driver class inda driver isminde bir instance variable da var
        // ve biz obje ureterek bu instance driver a ulasabiliriz

        //  Driver driver1 = new Driver();

        // Driver driver2 = new Driver();

        // Driver driver3 = new Driver();

        // Singleton Pattern kabul gormus bir pattern dir.
        // Amac bir class dan obje uretilmemesini saglamaktir
        // Bunun icin Singleton Pattern de koruyacagimiz class da
        // parametresiz bir constructor olusturur ve
        // bu constructor u private yapariz
    }

}
