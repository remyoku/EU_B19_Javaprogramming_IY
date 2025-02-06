package day21_ReturnMethodOverLoading;

import java.util.Scanner;

public class C03_NameOfMonth {
    public static void main(String[] args) {
        System.out.println(nameOfMonth(13));

    }

    public static String nameOfMonth(int num) {

        String monthName = " ";

        switch (num){
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "Jun";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> System.out.println("Yanlış değer girdiniz");
        }

        return monthName;


    }
}
