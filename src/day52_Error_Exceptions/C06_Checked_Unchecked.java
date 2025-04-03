package day52_Error_Exceptions;

import day37_Constructors_PassingObjects01.Banka;

import java.io.FileInputStream;

public class C06_Checked_Unchecked {
    public static void main(String[] args) {

        System.out.println("----- Unchecked Exceptions -----");

        int a = 15;
        int b = 0;
      //  System.out.println(a / b);  //ArithmeticException

        char [] chars ={'A','B','C'};
        //System.out.println(chars[7]);  //ArrayIndexOutOfBoundsException

        Banka banka = null;
      //  banka.getClass();         //NullPointerException

        String str = "Java";
        str = null;

      //  System.out.println(str.toUpperCase());  //NullPointerException

        System.out.println("--------------- Checked Exception ---------------");
        System.out.println("Hi");

       // Thread.sleep(3000);

       // FileInputStream file = new FileInputStream();

        // çalıştırıyorsam ve kırmızı kırnızı ise checked
        // çalıştırıyorsam ve o zaman karşıma çıkıyorsa unchecked
    }
}
