package day24_Reading_User_Input_Scanner;

import java.lang.*; // import etsemde etmesemde java bunu otomatik görür.
                   // * kullanırsa bir package içindeki bütün classları import eder

import java.util.Scanner; // sadece scanner classı import edilir.

public class C01_UserInput {
    public static void main(String[] args) {
        System.out.println("User Input in Java");

        Scanner klavye= new Scanner(System.in);
        System.out.println("Klavyeden isminizi giriniz: ");

        String name = klavye.nextLine();
        System.out.println("İsminiz: " +name);
    }
}

