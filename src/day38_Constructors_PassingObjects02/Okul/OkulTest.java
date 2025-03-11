package day38_Constructors_PassingObjects02.Okul;

import java.util.ArrayList;

public class OkulTest {
    public static void main(String[] args) {
        Adres adres = new Adres("Kayapınar", "Diyarbakır");
        System.out.println("adres.toString() = " + adres.toString());

        Adres okulAdresi = new Adres("Okullar Caddesi", "Çankaya", "Ankara", 123);
        Adres ogrenciEvAdresi = new Adres("Cumhuriyet Caddesi", "Etimesgut", "Ankara", 23);


        Ogrenci ogrenci = new Ogrenci("İrem", "1-A", 26, ogrenciEvAdresi, okulAdresi);
        Ogrenci ogrenci2 = new Ogrenci("Eslem", "1-B", 13, ogrenciEvAdresi, okulAdresi);

        Okul okul = new Okul("ABC Anadolu Lisesi", okulAdresi);

        System.out.println("ogrenci = " + ogrenci);
        System.out.println("okul = " + okul);
        System.out.println();

        okul.ogrenciEkle(ogrenci);
        okul.ogrenciEkle(ogrenci2);

        System.out.println("okul = " + okul);
        System.out.println();

        Ogrenci ogrenci3 = new Ogrenci("İkbal");
        Ogrenci ogrenci4 = new Ogrenci("Ömer");
        Ogrenci ogrenci5 = new Ogrenci("Homi","1-C",4);

        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(ogrenci3);
        ogrenciler.add(ogrenci4);
        ogrenciler.add(ogrenci5);

        Okul yeniOkul = new Okul("Yeni Okul",new Adres(),ogrenciler);
        System.out.println("yeniOkul = " + yeniOkul);
    }
}
