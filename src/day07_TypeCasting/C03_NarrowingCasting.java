package day07_TypeCasting;

public class C03_NarrowingCasting {
    public static void main(String[] args) {

        byte b = 5;
        short sh =4556;

        b= (byte) sh; // narrowing - explicit - manual casting

        // sh nin short olduğunu biliyorum data kaybolabilir ve  byte a atabilirsin
        // veri kaybolursa olsun, demek oluyor. b=sh yapamazsın b = (byte) sh ; yapabilirsin. sh isterse 1 bile olsun.

        System.out.println("b = " + b);

        int x = 130;
        byte y = (byte) x; // narrowing - explicit - manual casting

        System.out.println("y = " + y);

        float fl = 2334.5f;
        int i= (int) fl; // narrowing - explicit - manual casting


        System.out.println("i = " + i);

       short b1 = 30;
        short b2 = 40;

        short z = (short) (b1 - b2); // narrowing - explicit - manual casting

        System.out.println("z = " + z);

        int sayi1 = b1*b2;

        double d = 5.2;
        int s = 2;

        int t = (int) (d+s); // narrowing - explicit - manual casting


        //double işleme giriyorsak her zaman doubledır.
        System.out.println("t = " + t);


        //küçük değişken büyük değişkene atılır sıkıntı yok. ama büyük küçüğe atanınca şartlı atanır.




    }

}
