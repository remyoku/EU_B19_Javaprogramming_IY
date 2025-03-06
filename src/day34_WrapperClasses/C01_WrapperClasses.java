package day34_WrapperClasses;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /**
         * Wrapper Classes
         *
         * bizim primitive datalarımızı alıp objeye çeviriyor
         * ve o objeyi de alıp primitive çevirebiliyor.
         *
         * normalde int , boolean, char, byte şeklinde primitive yapılarımız var ve bunları
         * Integar, Boolean, Character, Byte şeklimde obje classları oluyor.
         */

        System.out.println("Wrapper Class in Java");
        System.out.println("Primitive data types");

        boolean bl = true;
        byte by = 12;
        short sh = 12500;
        int i = 123;
        long l = 1245645469465L;
        float fl = 454654615498.4556f;
        double d = 5457875458.565789754;
        char ch = 'A';

        System.out.println("bl = " + bl);
        System.out.println("by = " + by);
        System.out.println("sh = " + sh);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("fl = " + fl);
        System.out.println("d = " + d);
        System.out.println("ch = " + ch);

        //wrapper Classes
        //1. Constructor --> bu kullanımdan kaldırılacak (deprecated)

        Integer iWrp = new Integer(1234); // bu bir hata değil hata olarak görünse bile kullanılmıyor demek
        Integer iWrpStr = new Integer("1234");

        Boolean blWrp = new Boolean(true);
        Boolean blWrpStr = new Boolean("false");
        Byte byWrp = new Byte((byte) 12);
        Byte byWrpStr = new Byte("123");

        Character chWrp = new Character('A'); // CHARECTERDE STR KABUL ETMİYOR.


        System.out.println("iWrp = " + iWrp);
        System.out.println("iWrpStr = " + iWrpStr);

        //2.yol -- valueOf()

        Integer iWrpVl = Integer.valueOf(1890);
        Integer iWrpVlStr = Integer.valueOf("16234");

        Character chWrpVl = Character.valueOf('a');

        Boolean blWrpVl = Boolean.valueOf(true);
        Boolean blWrpVlStr = Boolean.valueOf("false");

        System.out.println("blWrpVl = " + blWrpVl);



        //3.yol Assigning Literal Way

        Integer iLtr = 45678;
        Character chLtr= 'C';
        Boolean blLtr= true;


        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("iWrpStr = " + iWrpStr);
        System.out.println("iWrpVl = " + iWrpVl);
        System.out.println(iWrpStr + iWrpVl); // int bir rakam çevirir ve toplayım verir str omasına rağmen.

        System.out.println("System.identityHashCode(iLtr) = " + System.identityHashCode(iLtr));
        System.out.println("System.identityHashCode(blWrp) = " + System.identityHashCode(blWrp));

        System.out.println("--------------------------------------------------------");

        Integer sayı1=12345;
        Integer sayı2=12345;

        System.out.println("(sayı1==sayı2) = " + (sayı1 == sayı2));
        System.out.println("sayı1.equals(sayı2) = " + sayı1.equals(sayı2));
        sayı1=sayı2;
        System.out.println("System.identityHashCode(sayı1) = " + System.identityHashCode(sayı1));
        System.out.println("System.identityHashCode(sayı2) = " + System.identityHashCode(sayı2));

        //Integar cashing -128 ile 127 arasındaki sayılar için == operatörü kullanılabilir.

        Integer number1 = 123;
        Integer number2 = 123;

        System.out.println("number1==number2 = " + (number1 == number2));


    }
}
