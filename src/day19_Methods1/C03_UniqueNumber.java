package day19_Methods1;

import java.util.Scanner;

public class C03_UniqueNumber {
    public static void main(String[] args) {
        uniqueNumber();

    }
    /*
    verilen üç sayı içerisinde kaç farklı sayı olduğunu yazdıran method nedir?
     */

    public static void uniqueNumber(){

        Scanner sc =new Scanner(System.in);
        System.out.println("Lüften Üç Sayı Giriniz: ");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        int sayi3 = sc.nextInt();

       int sonuc;

        if (sayi1==sayi2 && sayi2 == sayi3){
            sonuc =1;
        } else if (sayi1 == sayi2 || sayi1==sayi3 || sayi2==sayi3) {
            sonuc =2;
        }else {
            sonuc = 3;
        }
        System.out.println("Farklı sayı adedi : " + sonuc);


        /**
         * ternary
         * sonuc = (sayi1==sayi2 && sayi2 == sayi3)? 1:(sayi1 == sayi2 || sayi1==sayi3 || sayi2==sayi3)?2:3;
         */
    }
}
