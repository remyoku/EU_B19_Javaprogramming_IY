package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C02_UsersInput {
    public static void main(String[] args) {
        C01_UserInput c01UserInput = new C01_UserInput(); //aynı package içinde başka bir classı
        // import etmeden kullanabiliriz.

        //constructor--altyapı
        // Scanner input = new Scanner (System.in);
        // ismi               asıl değer. () olan yerde method vardır.
        // classın ismi ile aynı olan ve baş harfi de büyük olan method ismidir--constructor.
        // bir objeye ilk girişi o objeyi create ederken kullanıyoruz.

        System.out.println("Reading User's input with Scanner Class");

        Scanner sc = new Scanner(System.in);

        System.out.print("Klavyeden byte türünde veri giriniz : ");
        byte byte1 = sc.nextByte();
        System.out.println("Girilen değer: " + byte1);


        System.out.print("Klavyeden short türünde veri giriniz : ");
        short short1 = sc.nextShort();
        System.out.println("Girilen değer: " + short1);

        System.out.print("Klavyeden int türünde veri giriniz : ");
        int int1 = sc.nextInt();
        System.out.println("Girilen değer: " + int1);

        System.out.print("Klavyeden float türünde veri giriniz : ");
        float float1 = sc.nextFloat();
        System.out.println("Girilen değer: " + float1);

        System.out.print("Klavyeden double türünde veri giriniz : ");
        double double1 = sc.nextDouble();
        System.out.println("Girilen değer: " + double1);

        System.out.print("Klavyeden boolean türünde veri giriniz : ");
        boolean boolean1 = sc.nextBoolean();
        System.out.println("Girilen değer: " + boolean1);

        System.out.print("Klavyeden string türünde veri giriniz : ");
        String string1 = sc.next();
        System.out.println("Girilen değer: " + string1);

        sc.nextLine();

        System.out.print("Klavyeden string türünde veri giriniz : ");
        String string2 = sc.nextLine();
        System.out.println("Girilen değer: " + string2);

        //next();  ve nextLine();
        // arasında ki fark next e diyelim İrem Yokuş yazdın iremi alır boşluktan sonrasını almaz.
        // nextLine da ise İrem Yokuş yazarsın İrem Yokuşu direkt alır.
        //String bir değişkenden sonra tekrar string alırken araya sc.nextLine(); koymamız lazım ki alt satıra geçelim.

        //Klavyeden tek harf girişi
        System.out.print("Klavyeden bir harf giriniz: ");
        char harf = sc.next().charAt(0);//ilk harfi döner

        System.out.println("Girilen harf: " + harf);
        sc.close();

        //uygun değer girilmez ise InputMismatchException hatası alırız.

    }
}
