package day06_Arithmetic_UnaryOperators;

public class C01_ArithmeticOperators {
    public static void main(String[] args) {
        /*
        + - * / %

        İşlem Önceliği
        1. () içindeki işlemler
        2. * / %
        3.+-
         */

        System.out.println("90" + 10); //9010
        System.out.println(10 + "90"); // 1090
        System.out.println(10 + 10 + "90"); //2090
        System.out.println(10 + "90"+ 10); //109010
        System.out.println("90" + 10 + 10);//901010
        System.out.println(10 + 20 + 30 + "90"); // 6090
        System.out.println(""+ 10 + 20 + "90"); //102090
        // string ("") kendisinden sonra ki ifadeleri toplamaz birleştirir.

        int x= 5;
        int y=2;
        int z= x+y; //7
        System.out.println("z = " + z);

        System.out.println("Merhaba"+ x + y); // Merhaba52
        System.out.println( x - y +"Merhaba");// burda  - yazarsak stringten sonra hata verir. ("" + x - y )

        System.out.println("Merhaba" + "Dünya");

         // 5 / 2 * 4 %( 12-9)

        double num= ( double) 5 / 2 * 4 %( 12-9);
        System.out.println("num = " + num);


    }
}
