package day26_StringClass01;

import java.util.Scanner;

public class C08_Palindrome {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz  !!!");
        String girilenMetin = input.nextLine();

        String tersMetin = "";

        for (int i = girilenMetin.length()-1; i >=0 ; i--) {
            tersMetin+=girilenMetin.charAt(i);
        }

            if (girilenMetin.equals(tersMetin)){
                System.out.println("Girmiş olduğunuz metin bir Palindrome metin örneğidir.");
                System.out.println(true);
            }else {
                System.out.println("Girmiş olduğunuz metin bir Palindrome metin örneği değildir.");
                System.out.println(false);
            }



    }

}

/*
    herhangi bir metin tersten de aynı ise palindrome denir.
    kullanıcıdan bir metin alın metin palindrome ise true değil ide false yazdırın.
     */