package day31_Arrays02;

import java.util.Arrays;
import java.util.Scanner;

public class C04_CompareLoops {
    public static void main(String[] args) {

        int [] sayilar = {1,2,3,4,5};

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println("sayilar[i] = " + sayilar[i]);
        }
        System.out.println("-------------------------------");

        for (int sayi  :sayilar ) {
            System.out.println("sayi = " + sayi);
        }
        System.out.println("-------------------------------");

        // fori loop ile terstenm elemanları alıp manüple edebiliriz ama foreach ile yapamayız.
        for (int i = sayilar.length-1; i >=0 ; i--) {
            System.out.println("sayilar[i] = " + sayilar[i]);
        }

        System.out.println("Alışveriş Sepeti");

        String [] sepet = new String[5];
        Scanner sc = new Scanner(System.in);

        for (String urun  :sepet ) { // foreach öyle değil kuralları var tek düze bir metod.
        		    urun = sc.nextLine();
        		}




        /*for (int i = 0; i < sepet.length; i++) { ben for i istediğim gibi kullanabilirim.
            sepet[i]=sc.nextLine();
        }*/

        System.out.println(Arrays.toString(sepet));
    }
}
