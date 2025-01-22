package day12_Switch_Case;

import java.util.Scanner;

public class C06_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hesap Makinası");
        System.out.println("--------------");

        int sonuç=0;

        System.out.println("1.Sayıyı Giriniz: ");
        int sayı1 = input.nextInt();

        input.nextLine();

        System.out.println("Bir işlem Operatörü giriniz -> '+', '-', '*', '/' :  ");
        String işlemOperatörü = input.nextLine();

        System.out.println("2.Sayıyı Giriniz: ");
        int sayı2 = input.nextInt();

        switch (işlemOperatörü){
            case "+"-> sonuç = sayı1+sayı2;
            case "-"-> sonuç = sayı1-sayı2;
            case "*"-> sonuç = sayı1*sayı2;
            case "/"-> {
                if (sayı2 == 0){
                    System.out.println("2.Sayı 0 olamaz. Tekrar Gir...");
                    sayı2=input.nextInt();
                }
                sonuç = sayı1/sayı2;
            }
            default -> System.out.println("Yanlış Operatör Girdiniz!!!");
        }

        System.out.println("sonuç = " + sonuç);
    }
}
