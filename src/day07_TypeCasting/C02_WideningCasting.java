package day07_TypeCasting;

public class C02_WideningCasting {
    public static void main(String[] args) {
        // byte < short < int < long < float < double

        byte b = 127;
        short sh = 45;

        sh = b;  // widening casting - implicit casting - automatic
        // küçük bir değişkeni alıp büyük bir değişkenin içine atabiliyoruz.
        // shortun içine byteın atanan değerini atabiliyoruz.

        System.out.println("sh = " + sh);

        int i = 14;
         i =sh; // widening casting - implicit casting - automatic

         long l = 554564554656l;
         l =b; // widening casting - implicit casting - automatic

        System.out.println("l = " + l);

        float f = 2.5f;
        double d = 5.6;

        d=f; // widening casting - implicit casting - automatic

        System.out.println("d = " + d);


    }
}
