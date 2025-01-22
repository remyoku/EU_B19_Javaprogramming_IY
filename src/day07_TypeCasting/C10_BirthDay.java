package day07_TypeCasting;

import java.util.Scanner;

public class C10_BirthDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String name = input.nextLine();

        System.out.println("Lütfen doğum gününüzü giriniz: ");
        int birthDay = input.nextInt();

        input.nextLine();

        System.out.println("Lütfen doğum ayınızı giriniz: ");
        String birthMonth = input.nextLine();

        System.out.println("Lütfen doğum yılınızı giriniz: ");
        int birthYear = input.nextInt();

        System.out.println("name = " + name);
        System.out.println("birthDay = " + birthDay);
        System.out.println("birthMonth = " + birthMonth);
        System.out.println("birthYear = " + birthYear);
        System.out.println();
        System.out.println("Irem was born on " + birthMonth + "/"+ birthDay+ "/"+ birthYear);
        System.out.println("Irem was born on \"" + birthMonth + "\\"+ birthDay+ "\\"+birthYear +"\"");
    }
}
