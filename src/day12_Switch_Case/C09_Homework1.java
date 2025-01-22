package day12_Switch_Case;

import java.util.Scanner;

public class C09_Homework1 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan aldigi urun urunAdedi ve urun fiyatini alin,
//        kullaniciya musteri karti olup olmadigini sorun.
//        Musteri karti varsa
//              10 urun veya fazla alirsa %20,
//              10 urunden az alirsa %15 indirim yapin,
//        Musteri karti yoksa
//              10 urun veya fazla alirsa %15,
//              10 urunden az %10 indirim yapin


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kaç Ürün Aldığınızı Giriniz: ");
        double urunAdedi = input.nextDouble();
        System.out.println("Ürünün Fiyatı : ");
        double urunFiyati = input.nextDouble();
        System.out.println("Müşteri Kartınız var mı ? Evet/Hayır");
        String cevap = input.next();

        double toplamFiyat = urunAdedi * urunFiyati;
        double indirimliFiyat = toplamFiyat;


        if (cevap.equalsIgnoreCase("Evet")){
            if (urunAdedi >= 10){
                indirimliFiyat = toplamFiyat*0.80;
                System.out.println("indirimliFiyat = " + indirimliFiyat);
            }else{
                indirimliFiyat = toplamFiyat*0.85;
                System.out.println("indirimliFiyat = " + indirimliFiyat);
            }

        } else if (cevap.equalsIgnoreCase("Hayır")) {
            if (urunAdedi >= 10){
                indirimliFiyat = toplamFiyat * 0.85;
                System.out.println("indirimliFiyat = " + indirimliFiyat);
            }else {
                indirimliFiyat = toplamFiyat*0.90;
                System.out.println("indirimliFiyat = " + indirimliFiyat);
            }

        }else {
            System.out.println("Geçersiz Cevap Girdiniz");
        }

        System.out.println("Toplam ödemeniz gereken tutar: " +indirimliFiyat + " TL ");
    }
}
