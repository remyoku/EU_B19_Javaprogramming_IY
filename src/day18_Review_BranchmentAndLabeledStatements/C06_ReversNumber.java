package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C06_ReversNumber {
    public static void main(String[] args) {
        //verilen sayıyı tersten yazan bir döngü yazınız.
        // 123 --< 321
        //720 --> 27 //while loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();
        int tersSayı = 0;

        while (sayi !=0){
            int sonHane = sayi % 10;
            System.out.println("sonHane = " + sonHane);
            tersSayı = tersSayı* 10 + sonHane;
            sayi /=10;
            System.out.println("tersSayı = " + tersSayı);
        }
    }
}
