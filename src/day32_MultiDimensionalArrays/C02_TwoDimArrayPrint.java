package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_TwoDimArrayPrint {
    public static void main(String[] args) {

        double[][] doubleNumbers = new double[5][3];

        doubleNumbers[2][2] = 8;
        doubleNumbers[3][2] = 8;

        //Çok boyutlu arrayin deepToString ile yazdırma.

        System.out.println("Arrays.deepToString(doubleNumbers) = " + Arrays.deepToString(doubleNumbers));

        // for i loop + toString ile yazdırma

        for (int i = 0; i < doubleNumbers.length; i++) {
            System.out.println("Arrays.toString(doubleNumbers[" + i + "]) = " + Arrays.toString(doubleNumbers[i]));
        }

        System.out.println("----------------------- klasik for ile -----------------------");

        for (int satir = 0; satir < doubleNumbers.length; satir++) { //satır döngüsü
            for (int sutun = 0; sutun < doubleNumbers[satir].length; sutun++) {
                System.out.print(doubleNumbers[satir][sutun] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("-----------------advanced for ile (for each)--------------------");

        //doubleNumbersI FOR EACH ile yazdırma

        for (double[] satırDoubles : doubleNumbers) {
            for (double number : satırDoubles) {
                //System.out.print(number + " ");

                if (number == 8) {
                    System.out.println("Sayı Bulundu");
                }
            }
            System.out.println();
        }

    }
}
