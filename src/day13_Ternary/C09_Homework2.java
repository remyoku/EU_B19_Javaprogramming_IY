package day13_Ternary;

import java.util.Scanner;

public class C09_Homework2 {
    public static void main(String[] args) {

        //Task 1
        //Write a program to display whether the number is an odd number or even number by using ternary operator:
        //Sample:331341 is odd number

        Scanner veriGirin = new Scanner(System.in);
        System.out.println("Please Enter The Number : ");
        int number = veriGirin.nextInt();


        String result = number%2 ==0 ? number + " çift sayıdır." : number + " tek sayıdır.";
        System.out.println("result = " + result);

        //Task 2
        //Write a program that checks if a student passed the exam or not by using ternary operator:
        //Sample1:Your mark is 80 and you passed
        //Sample2:Your mark is 45 and you failed. You needed 5 more points to pass the exam

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mark: ");
        int mark = input.nextInt();
        int geçmeNotu= 60;

        String exam = mark >= geçmeNotu ? "Your mark is "+mark+ " and you passed."
                :"Your mark is "+mark+ " and you failed.You needed " + ( geçmeNotu - mark) + " more points.";
        System.out.println(exam);

        //Task 3
        /*Write a program that accepts name, age and checks if a candidate is selected for job by using
        ternary operator:
        Sample1: Hi Ahmet Yilmaz you are selected as QA Engineer
        Sample2: Hi Ahmet Yilmaz you are not selected as QA Engineer*/


        Scanner veriGir = new Scanner(System.in);
        System.out.print("Lütfen Adınızı-Soyadınızı Giriniz: ");
        String name = veriGir.nextLine();
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        int age = veriGir.nextInt();

        String mesaj = age >= 18
                ? "Sayın "+name+ " QA Engineer olarak işe alındınız. Tebrikler"
                :"Sayın " + name+ " vermiş olduğumuz koşul sağlanamadığından ötürü QA Engineer olarak işe alınamadınız.";

        System.out.println("mesaj = " + mesaj);

        //Task 4
        /*
         Write a program that checks if a triangle is valid or not by using ternary operator:
        Sample: This is not a valid triangle
         */

        Scanner kenarAl = new Scanner(System.in);
        System.out.print("Üçgen için 1.Kenarı Giriniz: ");
        int a = kenarAl.nextInt();
        System.out.print("Üçgen için 2.Kenarı Giriniz: ");
        int b = kenarAl.nextInt();
        System.out.print("Üçgen için 3.Kenarı Giriniz: ");
        int c = kenarAl.nextInt();



        String check = a + b >c && a + c > b && b + c > a
                ? "Bu kenar uzunlukları üçgen olma özelliği taşımaktadır."
                : "Bu kenar uzunlukları üçgen olma özelliği taşımamaktadır.";

        System.out.println("check = " + check);


    }
}
