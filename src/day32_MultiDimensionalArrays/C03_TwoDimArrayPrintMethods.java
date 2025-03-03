package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_TwoDimArrayPrintMethods {
    public static void main(String[] args) {

        int [][] numbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        printArray(numbers);
        forIndexPrint(numbers);
        forEachPrint(numbers);
    }
    // deepToString ile yazdırma

    public static void printArray(int [][] dimArr){
        System.out.println("Arrays.deepToString");
        System.out.println("-------------------");

        System.out.println(Arrays.deepToString(dimArr));
    }
    public static void forIndexPrint(int [][] dimArr){
        System.out.println("klasik fori ile yazdırma");
        System.out.println("------------------------");

        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                System.out.print( dimArr[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
    public static void forEachPrint(int[][] dimArr){
        System.out.println("for each ile yazdırma");
        System.out.println("---------------------");
        for (int [] eachRow :dimArr ) {
        		for (int n :eachRow ) {
                    System.out.print(n + " - ");
        				}
            System.out.println();
        		}
    }
}
