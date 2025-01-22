package day06_Arithmetic_UnaryOperators;

import java.util.Scanner;

public class C06_SayininRakamlariToplami {
    public static void main(String[] args) {
        // Kullanıcıdan 3 basamaklı bir sayı alın
        //112  = 1+2+2 = 4
        //952  = 9+5+2 = 16

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz : ");

        int number = scanner.nextInt();
        System.out.println("number = " + number);

        // 345

        int lastDigit= number%10; // 345----5

        number/=10;
        System.out.println("number = " + number); //34

        int secondDigit = number%10; //4

        int thirdDigit= number/10; //3

        int toplam = lastDigit + secondDigit + thirdDigit;
        System.out.println("toplam = " + toplam);


    }
}
