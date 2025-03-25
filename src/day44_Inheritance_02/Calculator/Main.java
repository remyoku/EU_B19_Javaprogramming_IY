package day44_Inheritance_02.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("calculator.cıkartma(23,12) = " + calculator.cıkartma(23, 12));
        System.out.println("calculator.toplama(12,34) = " + calculator.toplama(12, 34));

        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        System.out.println("advanceCalculator.carpma(5,6) = " + advanceCalculator.carpma(5, 6));
        System.out.println("advanceCalculator.toplama(12,23) = " + advanceCalculator.toplama(12, 23));

        ScinCalculator scinCalculator = new ScinCalculator();
        System.out.println("scinCalculator.ustAlma(12,2) = " + scinCalculator.ustAlma(12, 2));
        System.out.println("scinCalculator.bolme(24,4) = " + scinCalculator.bolme(24, 4));
        System.out.println("scinCalculator.toplama(12,36) = " + scinCalculator.toplama(12, 36));

        FlightCalculator flightCalculator = new FlightCalculator();
        System.out.println("flightCalculator.cıkartma(12,2) = " + flightCalculator.cıkartma(12, 2));
        flightCalculator.yonHesaplama();
        System.out.println("flightCalculator.carpma(13,5) = " + flightCalculator.carpma(13, 5));
        //flightCalculator.ustAlma
    }
}

/*
single level inheritance -parent - child - mümkün
multi level inheritance -- grandparent - parent - child ... mümkün
bir parenta ait birden fazla child -- bu da mümkün

Sadece Bir tane is a relationship - extend ilişkisi kurabiliriz.

multiple inheritance  -- javada yok - parent -parent > child --- mümkün değil

is a relationship
parent - child
super - sub
base - derived
 */