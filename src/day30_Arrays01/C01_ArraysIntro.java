package day30_Arrays01;

public class C01_ArraysIntro {
    public static void main(String[] args) {

        /**
         * Array;
         * Tek bir variable da birden fazla aynı tipte değeri tutabilen yapılardır.
         * Arrays sınıfı kendisine ait bir class
         */
        //Declering an Array
        //1.yol
        int [] sayilar;  //bir array declere etmiş oluyorum.[] parantez kullanarak
        String [] kelimeler;
        double [] oranlar;

        //2.yol
        int sayilar2 [];
        String kelimeler2 [];
        double oranlar2 [];

        //Array oluşturma
        //1.yol
        int [] sayilar3;
        sayilar3 = new int[5];//sayılar isminde bir değişkenim var array ,
        // int tipinde data tutuyor ve içerisine 5 tane data alıyor demek oluyor bu...

        //2.yol
        int sayilar4 [] = new int[10]; // bu da tek satırda tanımlama.

        //int [5] sayılar5 = new int[];  ---> yanlış tanımlama olur datayı new kısmında kullanırız.
        // biz new classı ile arraylardan bir obje oluşturmuş oluyoruz.

        int size = 10;
        int [] sayilar5 = new int[size]; //içinde 10 (size) tane değişken tutabiliyor

        //Assigning value to Arrays

        int [] sayilar6 = new int[5];

        sayilar6[0]=7; // bu yazılan 5 tane elementten 1. elemente 7 koy diyorum.
        sayilar6[1]=5; // 2.elemente 5 koy dedim.
        sayilar6[2]=12;
        sayilar6[3]=23;
        sayilar6[4]=45;

        System.out.println(sayilar6[0]);
        System.out.println(sayilar6[1]);
        System.out.println(sayilar6[2]);
        System.out.println(sayilar6[3]);
        System.out.println(sayilar6[4]);
        //yazdırma işlemini de bu şekilde yapıyorum.

        sayilar6[0]=15; // atamayı değiştirebiliriz.
        System.out.println(sayilar6[0]);

        int i = sayilar6[4]; // bu şekilde de bir atama yapabiliriz.

        System.out.println("i = " + i);

        int [] numbers = new int[5];
        for (int j = 0; j < numbers.length; j++) {
            System.out.println("numbers[i] = " + numbers[i]);
        }

    }
}
