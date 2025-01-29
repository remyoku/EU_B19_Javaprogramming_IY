package day15_ForLoops;

import java.util.Scanner;

public class C09_SayiBasamakDegeriToplama {
    public static void main(String[] args) {

        //kalvyeden girilen sayının basamak değeri toplamını veren kod?
        // örn: 123 --> 1+2+3 = 6
        // 45897 --> 4+5+8+9+7=33

        // meraklsına : aynı loop içimde basamak sayısını daa bulabilirsiniz..

        //Benim yaptığım
       /* Scanner veriGir = new Scanner(System.in);
        System.out.println("Lütfen Sayı Giriniz: ");
        int sayi = veriGir.nextInt();

        int toplam = 0;

        for (int i = 0; sayi > 0; sayi /= 10) {
            int basamak = sayi % 10;
            System.out.println("basamak = " + basamak);
            toplam += basamak;
        }
        System.out.println("Girmiş olduğunuz sayıların basamakları toplamı : " + toplam + " 'e eşittir.");*/

        //Hocanın yaptığı

        //1.step kullanıcıdan input al
        Scanner input = new Scanner(System.in);
        System.out.print("lÜTFEN BİR SAYI GİRİNİZ : ");
        int number = input.nextInt();

        //2.step loop içerisinde inputun uzunluğunu kaydet
        //3.step loop içerisinde her bir basamağın değerini alarak bir değişkende tut
        int basamakSayısı = 0;
        int basmakDeğerleriToplamı = 0;
        for (int i = number; i > 0;  ) {
            basamakSayısı ++;
            basmakDeğerleriToplamı += i%10;
            i /=10;


        }

        //4.step basamak değerleri toplamını ve basmaak sayısını yazdır.
        System.out.println("basamakSayısı = " + basamakSayısı);
        System.out.println("basmakDeğerleriToplamı = " + basmakDeğerleriToplamı);

    }
}
