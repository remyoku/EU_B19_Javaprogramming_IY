package day33_ReviewArrays;

import java.util.Arrays;

public class C01_ReggedArraySentencesAndWords {

    public static void main(String[] args) {

        String text = "Bu içerisinde cümleler olan örnek bir dokümandır. İçerisindeki cümleler gayet " +
                "doğal olarak farklı sayıda kelime içermektedir. Cümleler birbirinden nokta ile ayrılırken kelimeler " +
                "birbirinden boşluk ile ayrılmıştır. Bu taskın hedefi her bir cümlenin kaç kelimeden oluştuğunu " +
                "arrayleri kullanarak bulmaktır";

        String[] cumleler = text.split("\\. ");
        //. tek başına bölmek için kullanamayız \\ ile kullanılır.
        System.out.println("Arrays.toString(cumleler) = " + Arrays.toString(cumleler));

        System.out.println("cumleler.length = " + cumleler.length);//4

        String[][] kelimeler = new String[cumleler.length][];

        for (int i = 0; i < cumleler.length; i++) {
            kelimeler[i] = cumleler[i].split(" "); // cümleyi " " boşluklardan bölerek arraye çevirir.

        }
        for (String[] satır : kelimeler) {
            int counter = 0;
            for (String kelime : satır) {
                System.out.print(kelime + " - ");
                counter++;
            }
            System.out.println();
            System.out.println("Bu cümle " + counter + " kelimeden oluşmaktadır.");
        }
    }
}
