package day13_Ternary;

import java.util.Scanner;

public class C04_TernaryExample1 {
    public static void main(String[] args) {
        //Klavyeden bir sayı (x) girişi yapalım, girilen sayı 15 den büyük ise
        //diğer sayıya (y) 90 değerini atayalım değil ise 50 değerini atayalım.

        Scanner sayıGir = new Scanner(System.in);
        int x,y;
        System.out.print("Bir tam sayı giriniz: ");
        x = sayıGir.nextInt();

        y= x>15 ? 90: 50;
        System.out.println("y = " + y);
    }
}
