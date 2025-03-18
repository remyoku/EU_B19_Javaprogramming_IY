package day42_StaticMembers;

import static day42_StaticMembers.C08_Calculator.bölme;
import  static  java.lang.Math.*;

public class C09_CalculatorTest {
    public static void main(String[] args) {

       // C08_Calculator cal = new C08_Calculator();
        //System.out.println("cal.cıkarma(3,2) = " + cal.cıkarma(3, 2));
        System.out.println("C08_Calculator.carpma(5,6) = " + C08_Calculator.carpma(5, 6));

        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));

        //static import
        System.out.println("Math.max(6,9) = " + Math.max(6, 9));
        System.out.println("Math.abs(-3) = " + Math.abs(-3));

        System.out.println("bölme(9,2) = " + bölme(9, 2));
    }
}
