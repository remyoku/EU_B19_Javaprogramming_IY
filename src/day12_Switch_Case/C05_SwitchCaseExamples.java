package day12_Switch_Case;

import java.util.Scanner;

public class C05_SwitchCaseExamples {
    public static void main(String[] args) {

        /*

Write a program to display traffic light colors using following logic:
if code (R/r)—>"Red"
if code (A/a)—>"Amber"
if code (G/g)—>"Green"
*/

        Scanner renkGir = new Scanner(System.in);
        System.out.println("Trafik Lambası Rengini Tek Harf Olarak Giriniz : ");
        String color = renkGir.next();


        switch (color) {
            case "R":
                System.out.println("Red");
                break;
            case "r":
                System.out.println("Red");
                break;
            case "A":
                System.out.println("Amber");
                break;
            case "a":
                System.out.println("Amber");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "g":
                System.out.println("Green");
                break;
            default:
                System.out.println("Trafik Lambasında Böyle Bir Renk Yoktur.");

        }
        ////////////////////////////////////////////////////////////////////////////////////////

        Scanner renkGir1 = new Scanner(System.in);
        System.out.println("Trafik Lambası Rengini Tek Harf Olarak Giriniz : ");
        char color1 = renkGir1.nextLine().charAt(0);


        switch (color1) {
            case 'R':
                System.out.println("Red");
                break;
            case 'r':
                System.out.println("Red");
                break;
            case 'A':
                System.out.println("Amber");
                break;
            case 'a':
                System.out.println("Amber");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'g':
                System.out.println("Green");
                break;
            default:
                System.out.println("Trafik Lambasında Böyle Bir Renk Yoktur.");

        }
    }
}
