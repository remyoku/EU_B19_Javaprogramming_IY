package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C03_SayılarınOrtalaması {
    public static void main(String[] args) {

//Create a scanner object
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan üç adet double türünde sayı girmesini isteyin
        System.out.print("Üç adet double türünde sayı giriniz : ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();  //değerleri birbirinden ayıtmak için enter ya da space kullanılır.
        double number3 = input.nextDouble();

        //calculate average
        double average = (number1 + number2 + number3) / 3;

        //display results
        System.out.println("The average of "
                + number1 + ", " + number2 + ", " + number3 + " is " + average);
    }
}
