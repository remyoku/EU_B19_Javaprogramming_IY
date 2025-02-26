package day31_Arrays02;

import java.util.Arrays;

public class C07_LargestNumber {
    public static void main(String[] args) {

       int [] x = {42,35,86,45,37,56};
       int [] y = {23,34,47,72,56,90,546};

       bigger(x,y);

    }
    public static void bigger(int [] arr1, int [] arr2){


        int sum2=0;
        int sum1=0;
        for (int a  :arr1 ) {
        		    sum1+=a;
        		}

        for (int a   :arr2 ) {
        		    sum2 +=a;
        		}

        if (sum1 > sum2){
            System.out.println(Arrays.toString(arr1)+ " Büyüktür ");
        } else if (sum1<sum2) {
            System.out.println(Arrays.toString(arr2)+ " Büyüktür ");
        }else {
            System.out.println(Arrays.toString(arr1)+ " ve "+ Arrays.toString(arr2)+ " birbirlerine eşittir.");
        }
    }
}
// Verilen 2 arraydeki sayilarin toplami buyuk olan arrayi tespit eden bir method yaziniz