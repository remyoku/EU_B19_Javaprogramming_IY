package day17_DoWhileLoops;

import java.util.Scanner;

public class C03_Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int şifre = 1234;
        int denemeSayisi = 1;
       while ( denemeSayisi <= 3) {

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
                System.out.println("denemeSayisi = " + denemeSayisi);
                if (denemeSayisi != 3) {
                    denemeSayisi++;
                    continue;
                }
            }
            System.out.println("Kartınız Bloke Oldu.");
            System.out.println("Lütfen Bankamıza Başvurunuz");
           denemeSayisi++;
        }//break noktası
    }
}
