package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C19_Homework {
    public static void main(String[] args) {
        /*
Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin.

Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

Soru 3- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin. Kullaniciya bitirmek istediginde 0'a basmasini soyleyin.
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve bunlarin toplaminin kac oldugunu yazdirin.
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin, bu negatif sayiyi sayi adedine ve toplama eklemeyin

Soru 4- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdirin.

Soru 5- Kullanicidan bir pozitif sayi isteyin, verilen sayı tam kare değilse kullanıcı sayı girmeye devam etsin,
tam kare ise : “Girilen sayı 2 sayısının tam karesidir.” yazdırsın..
Ornek : input : 16,  output : Girilen sayı 4 sayısının tam karesidir.
         */


        int sayi=14;

        while (sayi <100){
            System.out.println("sayi = " + sayi);
            sayi +=7;

        }
        System.out.println("-----------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Pozitif Bir Sayı Giriniz: ");
        int sayı = scanner.nextInt();

        int toplam = 0;

        while(sayı > 0){
         toplam += sayı%10;
         sayı /=10;

        }
        System.out.println(" Rakamları Toplamı : " + toplam);

        System.out.println("-----------------------------------------------------");

        Scanner veriGir = new Scanner(System.in);

        int toplam1 = 0;
        int sayac = 0;

        while (true){
            System.out.print("Lütfen Pozitif Bir Sayı Giriniz, Bitirmek İstediğinizde(0) Giriniz : ");
            int sayı1 = veriGir.nextInt();

            if (sayı1 == 0){
                break;

            } else if (sayı1 < 0) {
                System.out.println("Negatif Sayı Kullanamazsınız.");
                continue;
            }else{
                toplam1 +=sayı1;
                sayac ++;
            }
        }
        System.out.println("Toplam girilen pozitif sayı adedi: " + sayac);
        System.out.println("Girilen sayıların toplamı: " + toplam1);

        System.out.println("-----------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Pozitif Bir Sayı Giriniz: ");
        int sayı2 = sc.nextInt();
        System.out.print("Lütfen Hesaplamak İstdiğiniz Pozitif Bir Üs Giriniz :");
        int üs = sc.nextInt();

        int hesap = 1;

        while (üs > 0){
            hesap *= sayı2;
            üs --;

        }
        System.out.println("hesap = " + hesap);


        /*Soru 5- Kullanicidan bir pozitif sayi isteyin, verilen sayı tam kare değilse kullanıcı sayı girmeye devam etsin,
                tam kare ise : “Girilen sayı 2 sayısının tam karesidir.” yazdırsın..
        Ornek : input : 16,  output : Girilen sayı 4 sayısının tam karesidir.*/


        System.out.println("-----------------------------------------------------");

        Scanner input = new Scanner(System.in);


        int sayı3;

        outher:
        while (true) {
            System.out.print("Lütfen Pozitif Bir Sayı Giriniz: ");
            sayı3 = input.nextInt();


            for (int i = 1; i < sayı3; i++) {
                if (i * i == sayı3) {
                    System.out.println("Girilen sayı " + i + " sayısının tam karesidir.");
                    break outher;

                }

            }
            System.out.println("Girmiş olduğunuz sayı tam kare bir sayı değildir.");
        }

    }

}

