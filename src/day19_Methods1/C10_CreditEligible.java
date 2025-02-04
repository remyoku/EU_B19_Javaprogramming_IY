package day19_Methods1;

import java.util.Scanner;

public class C10_CreditEligible {
    public static void main(String[] args) {
        kredi();

    }
    public static void kredi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aylık Gelirinizi Giriniz: ");
        int aylikGelir = scanner.nextInt();

        if (aylikGelir >= 100_000) {
            userEligible();
        } else {
            userNotEligible();
        }
    }
    public static void userEligible(){
            System.out.println("Kredi Alabilir.");
        }

    public static void userNotEligible(){
        System.out.println("Kredi Alamaz");
    }
}
