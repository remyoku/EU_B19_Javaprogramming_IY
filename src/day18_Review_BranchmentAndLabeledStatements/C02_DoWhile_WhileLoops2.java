package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C02_DoWhile_WhileLoops2 {
    public static void main(String[] args) {

        /**
         * koşulun baştan bilindiği durumlarda ve döngünün hiç çalışmama ihtimali olduğunda
         * while kullanılır.
         * Örneğin: Kullanıcıdan geçerli bir sayı girimesi istendiğinde
         */

        Scanner sc = new Scanner(System.in);
        int sayi = 0;

        while (sayi <= 0){
            System.out.println("Lütfen pozitif bir sayı giriniz: ");
            sayi= sc.nextInt();
        }

        System.out.println(sayi + " girilmiştir.");

        /**
         * kullanıcıya bir menü bilgisi verilmek istendiğinde
         * do-while kullanıırz. Kullanıcı hatalı girse bile menüyü görür.
         */

        int secim;
        do {
            System.out.println("1- Başla");
            System.out.println("2- Çıkış");
            secim = sc.nextInt();
        }while (secim != 1 && secim != 2);

        System.out.println("Seçilen menü : " + secim);

    }
}
