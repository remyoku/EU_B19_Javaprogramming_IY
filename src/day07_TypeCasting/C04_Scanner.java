package day07_TypeCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // 1 . Scanner sınıfından bir obje oluşturuyoruzç

        Scanner scan = new Scanner(System.in);

        // 2. Kullanıcıyı bilgilendir!! Ne istediğini söyle

        System.out.print("Lütfen isminizi giriniz : ");

        //3. Girilen veriyi içine koyabileceğimiz uygun bir değişken oluştur.
        // scanner uygun methodu ile veriyi değişken içerisine yaz.

        String name = scan.next();
        // scan.next() ==> ilk boşluğa kadar metin alır. --- Ali Osman --- Ali yi alır.
        // scan.nextLine(); ==> ilk entera kadar alır.--- Ali Osman--- Ali Osman.

        System.out.println("İsminiz : " +name);

        //4. Close scanner
        scan.close();
    }
}
