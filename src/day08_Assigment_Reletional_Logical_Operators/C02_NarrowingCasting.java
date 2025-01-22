package day08_Assigment_Reletional_Logical_Operators;

public class C02_NarrowingCasting {
    public static void main(String[] args) {

        short s=5;
        byte b = (byte) s;
        System.out.println("b = " + b);

        s=128;

        byte b1 = (byte) s;

        System.out.println("b1 = " + b1);   //-128 yani veri kaybı olur.

        int i =25545;

        short sh = (short) i;
        System.out.println("sh = " + sh);

        double d = 2.4;

        int i1 = (int) d;
        System.out.println("i1 = " + i1);

        short number1 = 25;
        short number2= 55;
        short number3 = (short) (number1 + number2);

        double num1 =7;
        double num2 =7.7;
        double num3 = num1+ num2;

        System.out.println("num3 = " + num3);

        double x = 25 + 2 + 8 * .5; //işlemde bir yerde double varsa , sonuç doubledır.

        double z = 25 / 3; // veri kaybı olur.
        System.out.println("z = " + z);

        char c1 = 'A';
        char c2 = 'B';

        int v = c1 + c2;
        System.out.println("v = " + v);

        System.out.println(c1 > c2);

        System.out.println("--------------------------------------------");
        System.out.println(true + "string" + false);



    }
}
