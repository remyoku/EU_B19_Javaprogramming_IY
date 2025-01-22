package day09_Review;

import java.util.Scanner;

public class C08_BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (m) giriniz: ");
        double boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu(kg) giriniz: ");
        int kilo = input.nextInt();


        double bodyMassIndex = kilo / (boy * boy);

        System.out.println("Beden Kitle Endeksiniz :  " + bodyMassIndex);
    }
}
