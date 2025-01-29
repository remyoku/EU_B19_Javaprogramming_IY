package day15_ForLoops;

import java.util.Scanner;

public class C06_Faktoriyel {
    public static void main(String[] args) {

        //girilen sayının faktöriyel değerini bulunuz.

        Scanner veriGir = new Scanner(System.in);
        System.out.println("Faktoriyeli alınacak pozitif tam sayıyı giriniz: ");
        int girilenSayi = veriGir.nextInt();
        int sonuc = 1;

        for (int i = 1; i<= girilenSayi; i ++){
            sonuc *=i;
        }
        System.out.println("sonuc = " + sonuc);
    }
}
