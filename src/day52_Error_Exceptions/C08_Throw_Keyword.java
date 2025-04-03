package day52_Error_Exceptions;

import day52_Error_Exceptions.Exceptions.AgeException;

import java.util.Scanner;

public class C08_Throw_Keyword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age = 0;

        System.out.println("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();

        try {
            if (age < 18){
                //System.out.println("Yaş bilgisi 18 den küçük olamaz!!!");
                /**
                 * throw keyword ü ile manuel olarak exception attırabiliri.
                 */
            //    throw  new RuntimeException("Yaş bilgisi 18 den küçük olamaz!!!");
                throw new AgeException("Yaş bilgisi 18 den küçük olamaz!!!");
            }else {
                System.out.println("Yaşınız araç kullanmaya uygundur.");
            }
        } catch (AgeException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
