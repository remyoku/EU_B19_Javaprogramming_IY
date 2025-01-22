package day09_Review;

import java.util.Scanner;

public class C05_EvenlyDivisible {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number : ");
        int number = input.nextInt();

        boolean isDivisbleBy2 = (number%2 == 0);
        boolean isDivisbleBy3 = (number%3 == 0);
        boolean isDivisbleBy5 = (number%5 == 0);
        boolean isDivisbleBy6 = (number%6 == 0);
        boolean isDivisbleBy9 = (number%9 == 0);
        boolean isDivisbleBy11 = (number%11 == 0);

        System.out.println(number + "is divisible by 2 : "+ isDivisbleBy2);
        System.out.println(number + "is divisible by 3 : "+ isDivisbleBy3);
        System.out.println(number + "is divisible by 5 : "+ isDivisbleBy5);
        System.out.println(number + "is divisible by 6 : "+ isDivisbleBy6);
        System.out.println(number + "is divisible by 9 : "+ isDivisbleBy9);
        System.out.println(number + "is divisible by 11 : "+ isDivisbleBy11);



    }
     /*
* Create a class called C04_EvenlyDivisible,and write a program that gets an integer number from user
check if a number is evenly divisible by 2, 3, 5, 6, 9, 11

Ex:
number = 65;

output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
65 is divisible by 6: true
65 is divisible by 9: true
*/
}
