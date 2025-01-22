package day08_Assigment_Reletional_Logical_Operators;

public class C05_SwappingTwoNumbers {
    public static void main(String[] args) {

        //Verilen iki sayının değerlerini birbiriyle değiştiren kod nedir;

        int sayi1 =15;
        int sayi2 =33;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // 1 .çözüm

        int temp;
        temp = sayi1;
        sayi1=sayi2;
        sayi2 = temp;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //2.çözüm

        sayi1 += sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 -=sayi2;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


    }
}
