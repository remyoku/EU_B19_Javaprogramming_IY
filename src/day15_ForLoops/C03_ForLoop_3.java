package day15_ForLoops;

import java.util.Scanner;

public class C03_ForLoop_3 {
    public static void main(String[] args) {

        // döngü 0'dan 10 a indexi yazdırın.


        for (int i = 0; i<= 10; i ++){
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------------------------------------");

         // döngü 10'dan 0 a indexi yazdırın.

        for (int i = 10; i>= 0; i --){
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------------------------------------");

        //28 den 97 e kadar olan sayıları 8 er 8 er  artıralım

        for (int i = 28; i<= 97; i += 8){
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------------------------------------");

        //97 den 28 e kadar olan sayıları 8 er 8 er  artıralım

        for (int i = 97; i>= 28; i -= 8){
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------------------------------------");

        //1'den 50' ye kadar olan sayıların toplamı nedir.

        int toplam = 0;
        for (int i= 1 ; i <= 50; i++ ){
            toplam += i;
        }

        System.out.println("toplam = " + toplam);

        System.out.println("-------------------------------------------------------");

        // verilen sayıya kadar olan sayıları toplayan kodu yazınız.

        Scanner veriGir = new Scanner(System.in);
        System.out.println("Lütfen Sayı Giriniz: ");
        int sayi = veriGir.nextInt();
        int sonuç = 0;
        for (int i = 1; i<= sayi ; i++){
            sonuç +=i;

        }
        System.out.println("sonuç = " + sonuç);

        System.out.println("-------------------------------------------------------");
    }
}
