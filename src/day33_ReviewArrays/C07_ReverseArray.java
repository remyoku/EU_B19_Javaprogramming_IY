package day33_ReviewArrays;

import java.util.Arrays;

public class C07_ReverseArray {
    public static void main(String[] args) {

        int [] number = {2,3,50,60,36};
        int [] result = reverseArrays(number);

        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
    // verilen arrayı tersine çeviren methodu yazınız.

    public static int[] reverseArrays(int[] num) {
        if (num.length < 2) return num;

        int[] reversed = new int[num.length];
        for (int i = num.length - 1, k = 0; i >= 0; i--, k++) {
            reversed[k] = num[i];
        }
        return reversed;

    }
    // bu sorunun for each ile yapılması ödevdir.
}
