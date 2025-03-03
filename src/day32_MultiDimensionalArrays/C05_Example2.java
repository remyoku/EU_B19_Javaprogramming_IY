package day32_MultiDimensionalArrays;

public class C05_Example2 {
    public static void main(String[] args) {

        int [][] number = new int[3][3];

        for (int r = 0; r < number.length ; r++) {
            for (int c = 0; c < number[r].length; c++) {
                number[r][c]=r+c;
            }
        }

        C03_TwoDimArrayPrintMethods.forIndexPrint(number);
    }
}
