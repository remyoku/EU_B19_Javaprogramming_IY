package day17_DoWhileLoops;

import java.util.Scanner;

public class C01_WhileLoops {
    public static void main(String[] args) {

        /**
         * Do-While Loops
         * Loops tekrar eden aynı işlemleri defalarca yazmadan işlem yapmamızı sağlayan bir fonksiyon
         * bir sayı aralığında birer arttırarak bir sayıyı bulma veya o sayıları kullanma
         * bir uygulamada son kullanıcıda input olark işleme sokma ve bu işi tekrarlama
         *
         * While Loops: while(koşu) olacak şekilde koşul true iken devam eden , ta ki koşul false
         * alana kadar devam edecek olan looplardır.
         *
         * for(assign ; koşul ; increment/decrement){
         *    //code
         * }
         *
         * //assign
         *
         *while(koşul){
         * //code
         * //increment/decrement
         * }
         */

        Scanner scanner = new Scanner(System.in);


        int şifre = 1234;
        for (int denemeSayisi = 1; denemeSayisi <= 3; denemeSayisi++) {
            if (denemeSayisi == 3)
                System.out.println("Dikkat Bu Son Hakkınız");
            System.out.print("Lütfen şifrenizi giriniz: ");
            int girilenŞifre = scanner.nextInt();
            if (girilenŞifre == şifre) {
                System.out.println("BAŞARILI");
                System.out.println("Hesaba Yönlendiriliyorsunuz...!");
                break;
            } else {
                System.out.println("BAŞARISIZ DENEME!!!");
                if (denemeSayisi != 3) {
                    continue;
                }
            }
            System.out.println("Kartınız Bloke Oldu.");
            System.out.println("Lütfen Bankamıza Başvurunuz");

        }//break noktası


    }
}
