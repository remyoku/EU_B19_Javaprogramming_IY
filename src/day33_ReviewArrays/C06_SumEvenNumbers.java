package day33_ReviewArrays;

public class C06_SumEvenNumbers {
    public static void main(String[] args) {

        int [] number = {1,2,3,4,5,6,7,8,9,60,50,80}; //210 çift sayıların toplamı
        System.out.println("Çift sayıların toplamı :  " + sumEvenNum(number));
        System.out.println("Çift sayıların toplamı :  " + sumEvenNum2(number));
    }
    //bir arrayin içinde ki çift sayıları toplayıp dönen methodu yazınız.

    public static int sumEvenNum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    //for i ile
    public static int sumEvenNum2(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0 ){
                sum +=arr[i];
            }
        }
        return sum;
    }
}
