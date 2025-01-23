package day13_Ternary;

import java.util.Scanner;

public class C09_Homework1 {
    public static void main(String[] args) {


        //1.Soru -Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.

        Scanner veriGir = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz : ");
        int sayi = veriGir.nextInt();

        String kontrol = sayi % 5 ==0 ? sayi + " sayısı 5'in tam katıdır.": sayi + " sayısı 5'in katı değildir.";
        System.out.println("kontrol = " + kontrol);

        //2.Soru - Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

        Scanner scr = new Scanner(System.in);
        System.out.println("1.Kenar Uzunluğunu Giriniz: ");
        int birinciKenar = scr.nextInt();
        System.out.println("2.Kenar Uzunluğunu Giriniz: ");
        int ikinciKenar = scr.nextInt();
        System.out.println("3.Kenar Uzunluğunu Giriniz: ");
        int üçüncüKenar = scr.nextInt();

        boolean eşkenarÜçgen = (birinciKenar==ikinciKenar) && (ikinciKenar==üçüncüKenar);

        String check = eşkenarÜçgen ? "Bu üçgen bir Eşkenar Üçgen'dir.":"Bu üçgen bir Eşkenar Üçgen değildir.";
        System.out.println("check = " + check);


        //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner veriIste = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz : ");
        char karakter = veriIste.next().charAt(0);


        //Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz: ");
        double not = input.nextDouble();

        String sonuc = not >=50 ? "Notunuz " +not+ " sınıfı geçtiniz." : "Notunuz " +not+ " maalesef kaldınız.";
        System.out.println("sonuc = " + sonuc);

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lütfen 1. Sayıyı Giriniz: ");
        int sayi1 = scanner1.nextInt();
        System.out.println("Lütfen 2. Sayıyı Giriniz: ");
        int sayi2 = scanner1.nextInt();


        int min = sayi1 > sayi2 ? sayi2 : sayi1;
        System.out.println("Girdiğiniz sayılardan küçük olan: " + min);

        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  Sayıyı Giriniz: ");
        int number = scanner.nextInt();

        int mutlak = number >= 0 ? number : -number;
        System.out.println("Bu sayının mutlak değeri: " + mutlak);
    }


}
