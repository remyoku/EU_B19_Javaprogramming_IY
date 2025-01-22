package day13_Ternary;

import java.util.Scanner;

public class C05_TernaryExample2 {
    public static void main(String[] args) {

        //Klavyeden bir kişinin adını ve yaşını alalım
        //eğer yaşı 18' e eşit ve büyük ise name + "oy kullanabilirsiniz" mesajı verelim
        // eğer yaşı 18 ' den küçükse name + "oy kullanamazsınız." mesajını verelim.

        Scanner veriGir = new Scanner(System.in);

        System.out.print("Lütfen adınızı Giriniz: ");
        String name = veriGir.nextLine();
        Scanner yaşGir = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı Giriniz: ");
        int age = yaşGir.nextInt();

        String mesaj = (age >= 18) ?  name + " oy kullanabilirsiniz." : name + " oy kullanma hakkınız yoktur";

        System.out.println("mesaj = " + mesaj);


    }
}
