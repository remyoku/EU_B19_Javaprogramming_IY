package day19_Methods1;

import java.util.Scanner;

public class C12_ReturnType {
    public static void main(String[] args) {
       int max = buyukSayi();
        System.out.println("max = " + max);
    }
    public static int buyukSayi(){
        Scanner input = new Scanner(System.in);
        System.out.println("İki Tane Sayı Giriniz : ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        if (sayi1 >=sayi2){
            return sayi1;
        }else {
            return sayi2;
        }
    }

}
