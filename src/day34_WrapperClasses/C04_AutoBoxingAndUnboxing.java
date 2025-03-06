package day34_WrapperClasses;

public class C04_AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        System.out.println("Autoboxing and Unboxing in Java");

       //Autoboxing primitive to Wrapper type

        int sayı = 3456; // primitive
        Integer sayıWrp = sayı; // Autoboxing
        System.out.println("sayıWrp = " + sayıWrp);

        //Unboxing Wrapper to primitive
        Integer sayıWrp1 = 12345;

        int sayı1= sayıWrp1; // Unboxing
        System.out.println("sayı1 = " + sayı1);

        System.out.println("sayı + sayıWrp1 = " + sayı + sayıWrp1);








    }
}
