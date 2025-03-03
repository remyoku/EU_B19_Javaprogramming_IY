package day31_Arrays02;

import java.util.Arrays;

public class C10_Homework {
    public static void main(String[] args) {

        int[] sayilar = {10, 15, 20, 25, 30, 35, 5};
        System.out.println("biggestNumber(sayilar) = " + biggestNumber(sayilar));

        System.out.println("checkNumber(sayilar) = " + checkNumber(sayilar));

        String[] word1 = {"Life", "is", "beautiful"};
        String[] word2 = {"life", "is", "hard"};
        System.out.println("checkEquals(word1,word2) = " + checkEquals(word1, word2));

        String[] birleştirme1 = {"Carpe Diem.!"};
        String[] birleştirme2 = {"Festina Lente."};
        String[] sonuc = arrayDöndür(birleştirme1, birleştirme2);
        System.out.println("Birleşmiş Array :  " + Arrays.toString(sonuc));

        System.out.println("bigger(sayilar) = " + bigger(sayilar));
    }

    //Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean biggestNumber(int[] num) {

        return num.length > 5;
    }

    //Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.
    public static boolean checkNumber(int[] num) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 5) {
                return true;
            }
        }
        return false;
    }

    //Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.
    public static boolean checkEquals(String[] args1, String[] args2) {

        if (args1.length > 0 && args2.length > 0) {
            return args1[0].equalsIgnoreCase(args2[0]);
        }

        return false;
    }

    //Verilen 2 arrayi birleştirip array döndüren bir method yazın.
    public static String[] arrayDöndür(String[] args3, String[] args4) {
        String[] yeniArray = new String[args3.length + args4.length];

        for (int i = 0; i < args3.length; i++) {
            yeniArray[i] = args3[i];
        }
        for (int i = 0; i < args4.length; i++) {
            yeniArray[args3.length + i] = args4[i];
        }
        return yeniArray;
    }

    //İnt arry in en büyük elemanının döndüren bir method yazın
    public static int bigger(int[] num) {
        int biggerNumber = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > biggerNumber) {
                biggerNumber = num[i];
            }
        }
        return biggerNumber;
    }


    }



