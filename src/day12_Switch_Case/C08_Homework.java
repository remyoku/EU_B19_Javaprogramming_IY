package day12_Switch_Case;

import java.util.Scanner;

public class C08_Homework {
    public static void main(String[] args) {
        /*

        Write a program that lets user to enter Mercedes, Volvo, Opel, Sahin Car
Models
If it is Mercedes display “Good one”
If it is Volvo display “Tough one”
If it is Opel display “Not bad”
If it is Sahin display “Not recommended”
Else “Do not buy that one!”

         */

        /*Scanner arabaGir = new Scanner(System.in);
        System.out.println("Lütfen Araba modelini Giriniz: ");
        String araba = arabaGir.next();*/

       //if-else ile;
        /* if (araba .equalsIgnoreCase("Mercedes")){
            System.out.println("Good one");

        } else if (araba.equalsIgnoreCase("Volvo")) {
            System.out.println("Tough one");

        } else if (araba .equalsIgnoreCase("Opel")) {
            System.out.println("Not bad");

        } else if (araba.equalsIgnoreCase("Şahin")) {
            System.out.println("Not recommended");
        } else {
            System.out.println("Do not buy that one !");
        }*/

        //switch ile;

       /* switch (araba){
            case "Mercedes":
                System.out.println("Good one");
                break;
            case "Volvo":
                System.out.println("Tough one");
                break;
            case "Opel":
                System.out.println("Not bad");
                break;
            case "Şahin":
                System.out.println("Not recommended");
                break;
            default:
                System.out.println("Do not buy that one!");

        }*/



        /*
        Write a program that shows students English Level
If Beginner display level=1
If Elementary display level=2
If Intermediate display level=3
If Advance display level=4
If Expert display level=5
         */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Lütfen İngilizce Seviyenizi Giriniz: ");
        int level = input.nextInt();
        String levelName = " ";


        switch (level){
            case 1 -> levelName = "Beginner";
            case 2 -> levelName = "Elementary";
            case 3 -> levelName = "Intermediate";
            case 4 -> levelName = "Advence";
            case 5 -> levelName = "Expert";
            default -> System.out.println("Girilen seviye uygun değildir.");

        }
        System.out.println("levelName = " + levelName);*/




        /*Write a program to display months:
1-January
2-February
3-March
4-April
5-May
6-June
7-July
8-August
9-September
10-October
11-November
12-December

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Ay Giriniz (1-12) : ");
        int month = input.nextInt();
        String monthName = " ";

        switch (month){
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
        System.out.println("monthName = " + monthName);


    }
}
