package day19_Methods1;

public class C17_Homework4 {
    public static void main(String[] args) {
        //Write a program that iterates numbers and checks if number is even or
        //odd, according to evaluation it sums even and odd numbers, displays result in
        //two different methods.
        // sumOfOddNumbers();
        //sumOfEvenNumbers();

        sumOfOddNumbers();
        sumOfEvenNumbers();

    }

    public static void sumOfOddNumbers() {

        int sumOfOdd = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sumOfOdd += i;
            }

        }
        System.out.println("Sum of Odd Numbers : " + sumOfOdd);
    }

    public static void sumOfEvenNumbers() {

        int sumOfEven = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            }

        }
        System.out.println("Sum of Even Numbers : " + sumOfEven);
    }
}
