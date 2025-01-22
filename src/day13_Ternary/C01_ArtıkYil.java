package day13_Ternary;

import java.util.Scanner;

public class C01_ArtıkYil {
    public static void main(String[] args) {

        /*
Kullanicidan artik yil olup olmadigini kontrol
etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil
degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen
yillar artik yildir
Kural 3: 4’un kati olmasina ragmen 100 ile
bolunebilen yillardan sadece
400’un kati olan yillar artik yildir

*/

        Scanner veriGir = new Scanner(System.in);
        System.out.println("Artık Yıl Tespit Programına Hoş geldiniz... ");
        System.out.println("Yıl Bilgisi Giriniz: ");

        int yil = veriGir.nextInt();

        if (yil%4 != 0){
            System.out.println(yil + " artık yıl değildir.");
        } else if (yil % 100 != 0 ) {
            System.out.println(yil + " artık yıldır.");

        } else if (yil % 400 == 0) {
            System.out.println(yil + " artık yıldır.");

        }else {
            System.out.println(yil + " artık yıl değildir.");
        }
    }
}

