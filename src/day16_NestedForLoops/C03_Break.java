package day16_NestedForLoops;

public class C03_Break {
    public static void main(String[] args) {
        /**
         * Break; kırma bırakma terketme
         * (atlama)
         *        -Loop içerisinde kullanılır.
         *        break aslında bir for un içinde bir şey arıyoruz for hepsini yazıyor biz şart koyup bu gelince
         *        dur diyoruz breakla.
         */

        for (int i = 1; i <=20 ; i++) {
            System.out.print(i + " , ");
            if(i==16){
                System.out.println("Burası Bursa burdan çıkış yok!");
                break;
            }
        }
        System.out.println("----------------------------------------------------------------------");

        int toplam=0;
        for (int i = 1; i <100 ; i++) {
            System.out.print(i + " , ");
            toplam +=i;
            if (toplam >= 160){
                break;
            }
        }
        System.out.println("toplam = " + toplam);

        System.out.println("----------------------------------------------------------------------");

        int toplamm=0;
        for (int i = 1; i <1000 ; i++) {
            System.out.print(i + " , ");
            toplamm +=i;
            if (toplamm >= 10000){
                break; //
            }
        }
        System.out.println("toplam = " + toplamm);

        System.out.println("----------------------------------------------------------------------");

        hans: //label
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {

                if (i*j==16 || i*j == 20){
                    break hans;// outer loop un sonuna atar
                }
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        } //break hans --> buraya gönderir.
    }
}
