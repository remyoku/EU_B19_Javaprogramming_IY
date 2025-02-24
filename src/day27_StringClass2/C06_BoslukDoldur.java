package day27_StringClass2;

import java.util.Scanner;

public class C06_BoslukDoldur {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lüften Metin Giriniz:");
        String sözcük = input.nextLine();

        sözcük = sözcük.replace(" ","&");
        System.out.println("sözcük = " + sözcük);

    }
}
//Kullanıcıdan bir dize sözcük alın ve her
// boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
// "   merhaba dünya  "   %%%merhaba%dünya%%