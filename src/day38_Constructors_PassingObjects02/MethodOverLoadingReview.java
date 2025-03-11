package day38_Constructors_PassingObjects02;

public class MethodOverLoadingReview {

    public static int ikiSayiTopla(int sayiA, int sayiB){
        return sayiA + sayiB;
    }

    public static int ucSayiTopla(int sayiA, int sayiB, int sayiC) {
        return sayiA + sayiB + sayiC;

    }
    public static int topla(int sayiA, int sayiB){
        return sayiA + sayiB;
    }
    public static double topla(int sayiA, double sayiB){
        return sayiA + sayiB;
    }
    public static double topla(double sayiA, int sayiB){
        return sayiA + sayiB;
    }
    public static int topla(int sayiA, int sayiB, int sayiC){
        //return sayiA + sayiB + sayiC;
        //return ucSayiTopla(sayiA,sayiB,sayiC);
        return topla(sayiA , sayiB) + sayiC;//method chaining

    }

    public static int topla(int... sayilar){
        System.out.println("variable args");

        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        return toplam;
    }


    public static void main(String[] args) {

        System.out.println("topla(12,23,43,53,63,89) = " + topla(12, 23, 43, 53, 63, 89));


    }
}
