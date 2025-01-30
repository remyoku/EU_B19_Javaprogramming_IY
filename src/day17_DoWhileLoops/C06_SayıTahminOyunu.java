package day17_DoWhileLoops;

import java.util.Scanner;

public class C06_SayıTahminOyunu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomSayısı= 43;
        int girilenSayı = 0;
        do{
            System.out.println("Lütfen 1-100 aralığında bir sayı giriniz: ");
           girilenSayı= scanner.nextInt();
        }while (girilenSayı  != randomSayısı);

        /**
         * kullanılan input belli değilse ve code çalışınca elde edilecekse do-while kullanılır.
         */
    }
}
