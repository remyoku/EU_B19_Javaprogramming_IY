package day16_NestedForLoops;

public class C04_Continue {
    public static void main(String[] args) {
        /**
         * continue; // skip , atlamak
         *  --Loop içerisinde kullanılır.
         *  --continue dan sonrakş kod kısmı atlanır çalıştırılmaz
         *
         *  break ve continue dan hemen sonra aynı statement in içinde kod yazılamaz: Unreachable statement hatası verir
         */

        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("------------------------------------------------");

        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("i = " + i);

        }
        System.out.println("------------------------------------------------");

        for (int i = 1; i < 20; i++) {
            if (i%2 == 0) {
                continue;
            }
            System.out.println("i = " + i);

        }
        System.out.println("------------------------------------------------");
        /**
         * 1-1000 arasında 3 e ve 5 e ortak bölünen
         * sayıları ekrana yazdırınız
         * sayıların adedini yazdırınız.
         */

        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (!(i%3 == 0 && i%5==0)) {
                continue;
            }
            count ++;
            System.out.println("i = " + i);
        }
        System.out.println("count = " + count);
    }
}
