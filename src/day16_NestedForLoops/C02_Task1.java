package day16_NestedForLoops;

public class C02_Task1 {
    public static void main(String[] args) {

        /**
         * 1 yıl = 12 ay
         * 1 ay = 30 gün varsayımına göre
         * 40 yıl yaşamış birisi
         * - Kaç ay yaşamıştır?
         * -Kaç gün yaşamıştır?
         */

        int yas = 40;
        int yilSayısı = 0;
        int aySayısı = 0;
        int günSayısı = 0;

        for (int yil = 1; yil < 41; yil++) {
            yilSayısı++;

            for (int ay = 1; ay < 13; ay++) {
                aySayısı ++;

                for (int gün = 1; gün < 31; gün++) {
                    günSayısı ++;

                }
            }

        }
        System.out.println("yilSayısı = " + yilSayısı);
        System.out.println("aySayısı = " + aySayısı);
        System.out.println("günSayısı = " + günSayısı);
    }
}
