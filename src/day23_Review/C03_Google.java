package day23_Review;

public class C03_Google {
    public static void main(String[] args) {

        System.out.println("Test Başladı");
        google();
        System.out.println("Test Bitti");

    }
    public static void google(){
        System.out.println("Google websitesine gidildi.");
        aramaYap();
        System.out.println("Tekrar googla döndü");

    }
    public static void aramaYap(){
        System.out.println("Ürün aratıldı");
        System.out.println("Arama sonuçlarından ürün cliklendi.");
        urunSitesineGit();
    }
    public static void urunSitesineGit(){
        System.out.println("Ürün sitesine gidildi");
        System.out.println("Ürün seçildi");
        sepeteEkle();
    }
    public static void sepeteEkle(){
        System.out.println("Ürün sepete eklendi");
        odemeYap();
    }
    public static void odemeYap(){
        System.out.println("Hesap bilgileri girildi");
        System.out.println("Onay kodu al");
        System.out.println("Onay kodu girindi ve ödememe tamamlandı.");

    }
}
/*
// google a git
// Arama yap
// Urunu bul sitesine git
// Urunu sepete ekle
// Odeme yap
// Onay kodu al
// Odemeyi tamamla
// google a geri don
 */
