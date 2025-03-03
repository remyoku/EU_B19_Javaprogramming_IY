package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class C08_ThreeDimensionalArray {

    public static void main(String[] args) {

        int[][][] threeDimArray = new int[3][2][2];

        System.out.println(Arrays.deepToString(threeDimArray));

        String str = "[[[0, 0], [0, 0]], [[0, 0], [0, 0]], [[0, 0], [0, 0]]]"; // deepToString()
        threeDimArray[2][0][1] = 555;
        System.out.println(Arrays.deepToString(threeDimArray));

        //literal way

        int[] arr = {2, 5, 8};
        String name = "Ali";
        String ad = new String("Mehmet"); // non literal way
        // literal vay bize yukarda ki gibi uzun uzun yazma yerine kısa yol sunuyor.

        //three dim array literal way

        int[][][] threeDimNumbers = {
                {
                        {2, -5},
                        {3, 2, 28, 36}
                },
                {
                        {0, 1},
                        {2, -98, 36, 2555},
                        {3, 9, 3},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9}
                }
        };

        System.out.println("threeDimNumbers.length = " + threeDimNumbers.length);//2
        System.out.println("threeDimNumbers[1].length = " + threeDimNumbers[1].length);//4
        System.out.println("threeDimNumbers[0][1].length = " + threeDimNumbers[0][1].length);//4
        System.out.println("threeDimNumbers[1][3].length = " + threeDimNumbers[1][3].length);//9

        //three dim array yazdırma (for each)

        for (int[][] twoDimArray : threeDimNumbers) {
            for (int[] oneDimArray : twoDimArray) {
                for (int number  :oneDimArray ) {
                   System.out.print(number + "  ");
                    //if (number < 0){
                       // System.out.println("Eksi Sayı Bulundu.");//böyle de tablo içinde ki istediğimiz bilgiye ulaşırız.
                    //}
                }
                System.out.println();
            }
            System.out.println("-------------------");
        }
        for (int i = 0; i < threeDimNumbers.length; i++) {
            for (int j = 0; j < threeDimNumbers[i].length; j++) {
                for (int k = 0; k <threeDimNumbers[i][j].length ; k++) {
                    System.out.print(threeDimNumbers[i][j][k]+ " / ");
                }
                System.out.println();
            }
            System.out.println("+++++++++++++++++++++++++++++++");
        }

    }
}
