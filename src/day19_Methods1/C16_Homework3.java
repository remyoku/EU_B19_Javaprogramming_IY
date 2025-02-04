package day19_Methods1;

import java.util.Scanner;

public class C16_Homework3 {
    public static void main(String[] args) {

        //Write a method that converts Celsius to Fahrenheit:
        //convertFahrenheit();

        convertFahrenheit();


    }
    public static void convertFahrenheit(){

        Scanner veriGir= new Scanner(System.in);
        System.out.println("Please Enter Celsius Temperature Value: ");
        double celsius = veriGir.nextDouble();

        // Celcius'u Fahrenheit'e çevirme formülü --> F=(C×9/5)+32
        double fahrenheit = (celsius *9/5)+32;

        System.out.println("Celsius to Fahrenheit : " + fahrenheit);

    }

}
