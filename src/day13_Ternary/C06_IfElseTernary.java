package day13_Ternary;

import java.util.Scanner;

public class C06_IfElseTernary {
    public static void main(String[] args) {

        //girilen sayının pozitif mi yada negatif olduğunu yazdıran kodu yazınız.

        //if -else

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        double sayi = input.nextDouble();

        if (sayi >= 0 ){
            System.out.println(sayi + " pozitif bir sayıdır.");
        }else{
            System.out.println(sayi + " negatif bir sayıdır.");
        }
        System.out.println("-------------------------------------------------------------------------");

        //ternary
        String sonuc = sayi >=0 ? sayi + " pozitif bir sayıdır." : sayi + " negatif bir sayıdır.";
        System.out.println("sonuc = " + sonuc);

    }
}
