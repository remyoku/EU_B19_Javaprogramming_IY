package day19_Methods1;

public class C07_Amazon {
    public static void main(String[] args) {

        //Amazon sayfasına git
        //login ol
        //ürün arat
        //sepete ekle
        //ödeme yap

        System.out.println("Test Başladı");
        amazonLogin();
        ürünArama();
        satınAlma();
        amazonLogout();
        System.out.println("Test Bitti");
    }
    public static void amazonLogin(){
        System.out.println("Amazon web sitesine git");
        System.out.println("Siteye login ol");
    }

    public static void ürünArama(){
        System.out.println("Arama kutusuna git");
        System.out.println("Bilgisayar ürününü arat");
        System.out.println("Çıkan sonuçları filtrele");
    }

    public static void satınAlma(){
        System.out.println("Ürün seç");
        System.out.println("Ürünü sepete ekle");
        System.out.println("Ödeme yap");
    }
    public static void amazonLogout(){
        System.out.println("Siteden çıkış yap");
    }
}
