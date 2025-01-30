package day17_DoWhileLoops;

import java.util.Random;
import java.util.Scanner;

public class C07_SayıTahminOyunu_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomSayısı = random.nextInt(0,100);
        int girilenSayı = 0;
        do{
            System.out.println("Lütfen 1-100 aralığında bir sayı giriniz: ");
            girilenSayı= scanner.nextInt();
        }while (girilenSayı  != randomSayısı);
    }
}
