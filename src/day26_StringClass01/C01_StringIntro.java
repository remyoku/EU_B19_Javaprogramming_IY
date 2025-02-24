package day26_StringClass01;

import day22_ClassObject.Car;

public class C01_StringIntro {
    public static void main(String[] args) {
        System.out.println("Javada String bir obje üretmek");

        /** non primitive bir data tipi
         * Bir şeyin classı varsa ben bundan obje üretebiliriz.
         * String de obje üretilebilen bir değişken
         * Stringten obje üretmenin iki farklı yolu var.
         * 1.By String Literal vaw
         * 2.By new keyword (new String())

         */
        // 1.By String Literal va
        //Stack        Heap(String pool)
        String str1 = "Java";
        String str3 = "Java";

        // değişken ismi str1 stack"te olur
        // bunun karşılığında da heapte java oluşuyor.--String pool

        System.out.println("str1 ---> " + System.identityHashCode(str1)); //hash kodunun ne olduğunu gösterir.
        System.out.println("str3 ---> " + System.identityHashCode(str3));

        //2.By new keyword (new String())
              //Stack                 Heap
        String str2 = new String("Merhaba"); // string poolda değil heapte oluşuyor.
        String str4 = new String("Merhaba"); // new keyword ile oluşturduğumda heapte oluyor.

        // 1. yolla oluşturduğumda str1 str3 aynı referansı verir
        // 2. yolla oluşturduğumda yeni bir obje oluşturur birbirine eşitlemez ikisisin refaransları farklı olur

        System.out.println("str2 ---> " + System.identityHashCode(str2));
        System.out.println("str4 ---> " + System.identityHashCode(str4));

        System.out.println(str1 == str3);// true döner
        System.out.println(str2 == str4);// false verir çünkü new ile yapıldı
        System.out.println(str2.equals(str4));// burda eguals kullanınca hash code karşılaştırmaz.
                                              // Metinleri kontrol eder eğer onlar aynı ise true döner.

        //Stringde bir değişkende iki metnin aynı metin olup olmadığını kontrol etmek istersek;
        // eguals() methodunu kullanırız.

        Car car = new Car();

        car.durdu();

    }
}
