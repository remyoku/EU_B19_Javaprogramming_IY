package day07_TypeCasting;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isim giriniz :");
        String isim=input.nextLine();


        System.out.println("Lütfen soyisim giriniz :");
        String soyIsim=input.nextLine();

        System.out.println("Lütfen yaşınızı giriniz : ");
        int yaş= input.nextInt();

        input.nextLine(); //enter için

        System.out.println("Lütfen doğum yerinizi giriniz : ");
        String dogumYeri= input.nextLine();




        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);
        System.out.println("yaş = " + yaş);
        System.out.println("dogumYeri =" +dogumYeri);
        System.out.println("Kaydınız Başarı ile Sonuçlanmıştır.");



    }
}
// Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
// Isminiz : Himmet
// Soyisminiz : Abi
// Yasiniz : 38
// Dogum Yeriniz : Kayseri
// Kaydiniz basariyla tamamlanmistir.