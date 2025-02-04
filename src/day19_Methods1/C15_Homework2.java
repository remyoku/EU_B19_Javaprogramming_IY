package day19_Methods1;

import java.util.Scanner;

public class C15_Homework2 {
    public static void main(String[] args) {

        //Write a method that calculates the sum of 3 numbers
        //sumOfNumbers();

        sumOfNumbers();

    }
    public static void sumOfNumbers(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Three Number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("Sum of Number = " + sum);
    }
}
