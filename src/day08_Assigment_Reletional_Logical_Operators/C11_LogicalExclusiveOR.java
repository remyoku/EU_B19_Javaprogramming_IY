package day08_Assigment_Reletional_Logical_Operators;

public class C11_LogicalExclusiveOR {
    public static void main(String[] args) {

        // biribirine eşitse iki sayı false olur.
        // birbirine eşit değilse iki sayı true olur.

        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ true); //true
        System.out.println(false ^ false); //false

        int sayi1 = 20;
        int sayi2 = 21;

        System.out.println("(sayi1 ^ sayi2) = " + (sayi1 ^ sayi2)); // 1 // aradaki farkı verir.
    }
}
