package day07_TypeCasting;

import java.util.Scanner;

public class C09_PhoneNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ülke kodunu giriniz: ");
        int countryCode = input.nextInt();

        System.out.println("Lütfen alan kodunu giriniz: ");
        int areaCode = input.nextInt();

        System.out.println("Lütfen telefon numaranızı giriniz: ");
        int localNumber = input.nextInt();

        System.out.println("countryCode = " + countryCode);
        System.out.println("areaCode = " + areaCode);
        System.out.println("localNumber = " + localNumber);
        System.out.println();
        System.out.println("My phone number is +(90)563-5667889");
    }
}
