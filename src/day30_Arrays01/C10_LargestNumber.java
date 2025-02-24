package day30_Arrays01;

public class C10_LargestNumber {
    public static void main(String[] args) {
        //Verilen listedeki sayilardan en buyuk olani ve kacinci sirada oldugunu tespit eden bir program yaziniz

        int [] sayılar = {263,3466,4671,835,3345,2136,976,6989,3421};

        int enBüyüksayı= sayılar[0];
        int sıra = 0;

        for (int i = 0; i <sayılar.length ; i++) {
            if (sayılar[i] >enBüyüksayı){
                enBüyüksayı = sayılar[i];
                sıra = i+1;
            }
        }

        System.out.println("enBüyüksayı = " + enBüyüksayı);
        System.out.println("Listede " + sıra+ " . sırada yer alan " + enBüyüksayı+" en büyük sayıdır.");
    }
}
