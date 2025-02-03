package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C01_DoWhile_WhileLoops1 {
    public static void main(String[] args) {

        // kod çalıştır  do while
        //şarta bak

        //şarta bak   while
        //kod çalıştır.

        //do -while loop ile verilen sayıdan başlayıp birer azaltarak
        // 3 e kadar olan sayıları yazdıralım

        Scanner sayıGir = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = sayıGir.nextInt();

        do {
            System.out.println(sayi);
            sayi --;
        }while (sayi>3);

        System.out.print("Bir tam sayı giriniz: ");
         sayi = sayıGir.nextInt();

         while (sayi>3){
             System.out.println(sayi);
             sayi --;
         }
    }
}
