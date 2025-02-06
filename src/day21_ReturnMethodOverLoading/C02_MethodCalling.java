package day21_ReturnMethodOverLoading;

import java.util.Scanner;

public class C02_MethodCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Hesaplanacak sayısı giriniz: ");
        int num=scanner.nextInt();

        if (num < 0){
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        }else {
            System.out.println(C01_Faktoriyel.faktoriyel(num));
        }

    }
}
