package day37_Constructors_PassingObjects01;

public class BankaTest {
    public static void main(String[] args) {
        Banka banka1 = new Banka();
        System.out.println("banka1.name = " + banka1.name);
        System.out.println("banka1.name.length() = " + banka1.name.length());

        System.out.println("banka1.adress = " + banka1.adress);
        System.out.println("banka1.hesapNo = " + banka1.hesapNo);
        System.out.println("banka1.hashCode() = " + banka1.hashCode());

        banka1.name ="ABC Bankası";
        System.out.println("banka1.name = " + banka1.name);
        System.out.println("banka1.name.length() = " + banka1.name.length());

        Banka banka2 = new Banka("XYZ Bankası","XYZ bulvarı no:3",5000);
        System.out.println("banka2.name = " + banka2.name);
        System.out.println("banka2.adress = " + banka2.adress);
        System.out.println("banka2.hesapNo = " + banka2.hesapNo);

        System.out.println("banka1.musteriler.size() = " + banka1.musteriler.size());

        Musteri musteri = new Musteri("İrem Yokuş","90 5077989514");
        Musteri musteri1 = new Musteri("Eslem Yokuş","90- 5456955614");
        Musteri musteri2 = new Musteri("İkbal Yokuş","30- 3077659814");
        Musteri musteri3 = new Musteri("Ömer Yokuş","49- 6639889514");

        System.out.println("musteri.name = " + musteri.name);

        banka2.musteriEkle(musteri); //passing object to method
        banka2.musteriEkle(musteri1); //passing object to method
        banka2.musteriEkle(musteri2); //passing object to method
        banka2.musteriEkle(musteri3); //passing object to method

        System.out.println("banka2.musteriler.size() = " + banka2.musteriler.size());

        banka2.paraYatir(musteri,100000);
        System.out.println("musteri.bakiye = " + musteri.bakiye);

        banka2.paraYatir(musteri,3400);
        System.out.println("musteri.bakiye = " + musteri.bakiye);

        banka2.paraYatir(musteri1,5000);
        banka2.paraYatir(musteri2,50000);
        banka2.paraYatir(musteri3,5500);

        banka2.müşteriListe();

        banka2.paraCek(musteri,400);
        banka2.müşteriListe();
    }
}
