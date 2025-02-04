package day19_Methods1;

import java.util.Scanner;

public class C14_Homework1 {
    public static void main(String[] args) {
        //Write a method that shows the grater number from two numbers
        //greaterNumber();

        greaterNumber();
    }
    public static void greaterNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen İki Farklı Sayı Giriniz: ");
        int number1 =scanner.nextInt();
        int number2 =scanner.nextInt();

        if (number1 >= number2){
            System.out.println("Greater number is " + number1);
        }else {
            System.out.println("Greater number is  " + number2);
        }
    }
}
