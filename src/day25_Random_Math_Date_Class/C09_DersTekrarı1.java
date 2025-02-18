package day25_Random_Math_Date_Class;

import java.util.Random;
import java.util.Scanner;

public class C09_DersTekrarı1 {
    public static void main(String[] args) {

       /* Random randomNumber = new Random();
        int number;

        while (true) {
            number = randomNumber.nextInt(50) + 50;
            System.out.println("all = " + number);
            if (number % 2 == 1) {
                break;
            }
        }
        System.out.println("last = " + number);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1-10 arasında bir sayı giriniz : ");
        int hedefSayi = scanner.nextInt();
        System.out.println("Bu program kaç denemede sayıyı bulduğunuzu gösterir.");

        Random random = new Random();
        int denemesayısı=0;

      while(true){
          denemesayısı++;
          int randomsaYı= random.nextInt(10)+1;
          System.out.println(randomsaYı);

      }*/
//girilen sayı 1 ile 10 arasında değilse tekrar gir ve 3 deneme hakkı ver.

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Lütfen 1-10 arasında bir sayı giriniz: ");
        int doğruSayı = random.nextInt(10) + 1; // 1 ile 10 arasında rastgele sayı
        int sayıTahminHakkı = 3;

        // İlk başta kullanıcıdan geçerli bir sayı almak
        int girilenSayı = input.nextInt();

        // Kullanıcı 1 ile 10 arasında geçerli bir sayı girene kadar döngü devam eder
        while (girilenSayı < 1 || girilenSayı > 10) {
            System.out.println("Lütfen 1-10 arasında bir sayı giriniz: ");
            girilenSayı = input.nextInt(); // Geçerli bir sayı alana kadar bekler
        }

        // Kullanıcıya 3 tahmin hakkı veriyoruz
        while (sayıTahminHakkı > 0) {
            if (girilenSayı == doğruSayı) {
                System.out.println("Tebrikler doğru sayıya ulaştınız...");
                break; // Doğru tahmin yapıldığında oyun biter
            } else {
                sayıTahminHakkı--; // Yanlış tahmin yapılırsa hak azalır
                if (sayıTahminHakkı > 0) {
                    System.out.println("Girilen sayı yanlış, kalan hakkınız: " + sayıTahminHakkı);
                    System.out.println("Tekrar deneyin:");
                    girilenSayı = input.nextInt(); // Yeni tahmin alınır
                } else {
                    System.out.println("Tahmin hakkınız kalmadı. Doğru sayı: " + doğruSayı);
                }
            }
        }

    }
}





