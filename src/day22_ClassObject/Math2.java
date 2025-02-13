package day22_ClassObject;

public class Math2 {

    /*
     Math2 adında bir class oluşturun.
       pow methodu yazın.--- pow(num1,num2)
       iki sayı alacak ve birinci sayı taban ikinci sayı kuvvet olacak.
       2 üzeri 4 = 2*2*2*2

       1.si obje oluşturmadan methodu farklı bir Main Classta çağırın.
       2.si obje oluşturarak methodu farklı bir main classta çağırın
     */

    public static int pow(int x, int y) {

        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;

        }

        return result;
    }

    public static int pow2(int x, int y) {

        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;

        }

        return result;
    }
}