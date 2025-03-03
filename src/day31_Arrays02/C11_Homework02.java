package day31_Arrays02;

import java.util.Arrays;

public class C11_Homework02 {
    public static void main(String[] args) {

       /* int[] numbers = {10, 20, 30, 40, 50, 60};

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        for (int num : numbers) {
            System.out.print(num + " ");*/

            int[] num1 = {10, 20, 30};
            int[] num2 = {40, 50, 60};

           newArray(num1,num2);

           int [] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println("Arrays.toString(terstenDöndür(numbers)) = " + Arrays.toString(terstenDöndür(numbers)));

        tekSayı(numbers);

        int [] newNumber={1,2,3,4};

        System.out.println("Toplam ve Çarpımları = " + Arrays.toString(toplamÇarpım(newNumber)));

    }



    //2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.
    public static int[] newArray(int[] number1, int[] number2) {

        int[] yeniArray = {number1[0],number2[0]};

        System.out.println("Yeni array : " +yeniArray[0] + " " + yeniArray[1]);


        return yeniArray;
    }
    //Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.

    public static int[] terstenDöndür(int [] arr){

        int [] newArrays = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            newArrays [arr.length-1-i]=arr[i];

        }

        return newArrays;
    }
    //Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.
    public static void tekSayı(int [] oddNumber){

        int oddSum = 0;

        for (int i = 0; i < oddNumber.length; i++) {
            if (oddNumber[i] % 2 == 1){
                oddSum +=oddNumber[i];
            }
        }
        System.out.println("Tek sayıların toplamı: " + oddSum);
    }
    //İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.
    public static int [] toplamÇarpım (int [] arr){

        int [] yeniArray = new int[2];

        int sum = 0;
        int multiplication = 1;

        for (int toplam  :arr ) {
        		    sum +=toplam;

        		}
        for (int carpım  : arr ) {
        		    multiplication *=carpım;
        		}
        yeniArray[0]=sum;
        yeniArray[1]=multiplication;
        return yeniArray;
    }
}
