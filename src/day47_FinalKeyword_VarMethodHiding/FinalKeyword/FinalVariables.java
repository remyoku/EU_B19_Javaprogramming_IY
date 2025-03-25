package day47_FinalKeyword_VarMethodHiding.FinalKeyword;

public class FinalVariables {

    //public final int MAX_SPEED; Instance variable classa ait ise ve bunu kullanmak istiyorsak başlatmak zorundayız.
    public final int MAX_SPEED = 320;// 1. yol aynı satır içinde başlar

    /*final int MIN_CAPACITY ;
    MIN_CAPACITY = 1; -- AYNI SATIR İÇİNDE YAZMALISIN */

    final int MAX_VELOCITY;

    final int MAX_WEIGHT;

    static final int MAX_HEIGHT = 200;

    final static int MIN_LEVEL;


    //public FinalVariables() {}

    public FinalVariables(int number){
        MAX_VELOCITY = number;// 2 .yol const içerisinde başlatılır.
       // MIN_LEVEL = 12;

    }

    {
        MAX_WEIGHT = 5; //3.yol blok içersinde tanımlıyorum.
        //MIN_LEVEL = 12;
    }

    static {
        MIN_LEVEL = 12;
    }



    public static void main(String[] args) {

        int sayi = 5;

        sayi = 7;

        //bir değişken sadece bir değer alsın ve başka değer almasın istiyorsam final kullanırım.
        //büyük harfle yazım görürsen bilki final -- clean code

        final int MAX_CAPACITY = 100;
        //MAX_CAPACITY = 200; bunu yapamayız değişmez.

        // Math.PI = 3,14; error

        FinalVariables obj = new FinalVariables(5);
        System.out.println(obj.MAX_SPEED);
        //obj.MAX_SPEED = 100; -- bu final olduğu için değiştiremezsin.
        System.out.println(obj.MAX_VELOCITY);
        System.out.println(obj.MAX_WEIGHT);

        System.out.println();
        FinalVariables obj1 = new FinalVariables(14);
        System.out.println(obj1.MAX_VELOCITY);
        System.out.println(obj1.MAX_WEIGHT);

        System.out.println(obj.MAX_HEIGHT);
        System.out.println(FinalVariables.MAX_HEIGHT);

        //FinalVariables.MIN_LEVEL = 15;
        //FinalVariables.MAX_HEIGHT = 2000;
    }
}
