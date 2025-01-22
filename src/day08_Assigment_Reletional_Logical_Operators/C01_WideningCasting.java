package day08_Assigment_Reletional_Logical_Operators;

public class C01_WideningCasting {
    public static void main(String[] args) {

        byte b = 25;
        short s;

        s= b;

        System.out.println("s = " + s);

        int i = s;
        System.out.println("i = " + i);

        long l = i;
        System.out.println("l = " + l);

        double d = l;
        System.out.println("d = " + d);

        int sayi= 10/3;
        System.out.println("sayi = " + sayi);

        double sayi1 = 10.0/3;
        System.out.println("sayi1 = " + sayi1);

        String name = "iREM";


        // double db = name; // bu data tipleri tamamen farklıdır. cast olmaz

    }
}
