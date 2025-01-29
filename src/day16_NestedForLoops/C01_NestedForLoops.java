package day16_NestedForLoops;

public class C01_NestedForLoops {
    public static void main(String[] args) {
        /**
         * Nested For Loos - İç içe for döngüleri
         * Loop nerelerde kullanılır :
         * -Tekraralayan benzer (aynı) işlemleri yaptırmak için
         * exmp -> Sayı dizisinde istenilen sayıyı arama
         *
         * Nested Loop  nerelerde kullanılır ?
         * -2 boyutlu bir tekrar işleminde kullanılır
         * exmp ->Tekrarlanan işlemlerin boyutları birden fazla ise
          */

        for (int i= 1; i<3; i++){ //2 satır çalışcak
            //code
            //System.out.print("x");
            System.out.print("i = " + i);
            for (int j = 1; j <5 ; j++) { //4 sütun çalışcak
                //code
                System.out.print("j= " + j);
                //System.out.print("x");

            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
        /**
                             x x x x x
                             x x x x x
                             x x x x x
         **/

        for (int i = 1; i <4 ; i++) {

            for (int j = 1; j <6; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

    }
    }

