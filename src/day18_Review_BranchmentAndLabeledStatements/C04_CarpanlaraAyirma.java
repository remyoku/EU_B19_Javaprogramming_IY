package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C04_CarpanlaraAyirma {
    public static void main(String[] args) {

        // bir sayının çarpanlarını yazdıran bir döngü kurgulayın.
        // 10 --> 1 2 5 10

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();
        String çarpanlar = "";

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0){
                çarpanlar += i + " ";

            }
        }
        System.out.println("çarpanlar = " + çarpanlar);
    }
}
