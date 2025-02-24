package day30_Arrays01;

public class C03_AlternatifYol {
    public static void main(String[] args) {

        //1.yol

        int [] numbers;

        //2.yol
        int numbers2 [];

        //3.yol
        int [] numbers3 , numbers4, numbers5;

        //4.yol
        int  numbers6, numbers7, numbers8 [];

        //5.yokl
         int numbers9[] ,numbers10[],number11[];

         // int [] numbers12 , [] numbers13; ---> error verir.

        int [] sayilar = {10,15,20,25,30,35}; // 5 tane değeri var 6. değeri atayamazsın.
        System.out.println("sayilar[0] = " + sayilar[0]);
        System.out.println("sayilar[1] = " + sayilar[1]);
        System.out.println("sayilar[2] = " + sayilar[2]);
        System.out.println("sayilar[3] = " + sayilar[3]);
        System.out.println("sayilar[4] = " + sayilar[4]);
        System.out.println("sayilar[5] = " + sayilar[5]);

        //System.out.println("sayilar[6] = " + sayilar[6]);//ArrayIndexOutOfBoundsException hatası verir.

        // Arrayler fixed sizedır. Yani boyutları sabittir. 6 diyorsam 6 dır 7 yi kabul etmez.

        System.out.println("sayilar = " + sayilar); // referansını verir heapteki karşılığını.


        /*int sayilar2 ;
        sayilar2 = {1,2,3,4,5};   --->
        Alterbatif yol ile array tanımlamak aynı satırda mümkündür.*/
    }
}
