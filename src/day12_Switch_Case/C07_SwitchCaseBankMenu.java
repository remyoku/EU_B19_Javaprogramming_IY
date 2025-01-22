package day12_Switch_Case;

import java.util.Scanner;

public class C07_SwitchCaseBankMenu {
    public static void main(String[] args) {

        System.out.println("ABC Bankasına Hoş Geldiniz");
        System.out.println("--------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("1-Bakiye Görüntüleme");
        System.out.println("2-Para Çekme");
        System.out.println("3-Para Yatırma");
        System.out.println("4-Çıkış");
        System.out.println("Yapacağınız İşlem Numarasını Giriniz : ");

        int secim = input.nextInt();
        int bakiye = 5000;

        switch (secim){
            case 1 :
                System.out.println("Bakiyeniz  = " + bakiye + " TL");
                break;
            case 2:
                System.out.println("Çekeceğiniz Para Miktarını Giriniz : ");
                int miktar = input.nextInt();
                if (miktar>bakiye){
                    System.out.println("Yetersiz Bakiye");
                    System.out.println("En Fazla Çekilebilecek Miktar = " + bakiye + " TL");
                }else{
                    bakiye -=miktar;
                    System.out.println("Güncel Bakiyeniz : " + bakiye + " TL");
                }
                break;
            case 3:
                System.out.println("Yatırmak İstediğiniz Miktarı Giriniz : ");
                int yatirilanMiktar = input.nextInt();
                bakiye += yatirilanMiktar;
                System.out.println("Güncel Bakiyeniz : " + bakiye + " TL");
                break;
            case 4:
                System.out.println("Bankamızı Tercih Ettiğiniz İçin Teşekkürler.");
                break;
            default:
                System.out.println("Geçersiz İşlem");
        }
    }
}
