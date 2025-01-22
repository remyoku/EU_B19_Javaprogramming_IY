package day06_Arithmetic_UnaryOperators;

public class C04_UnaryOperators {
    public static void main(String[] args) {

        // ++ --

        int a=10;
        a++; // a = a+1; //postincrement
        System.out.println(a);

        a--; // a=a-1
        System.out.println(a); // postdecriment

        System.out.println("--------------------------------------");

        ++a; // preincrement: sayının değerini hemen bir arttırıyorum.
        System.out.println(a);

        System.out.println(++a);

        --a; // predecrement : sayının değerini hemen 1 azaltır.
        System.out.println(a);

        System.out.println(--a);

        System.out.println("----------------------------------------");

        System.out.println(a--);
        System.out.println(a);

        System.out.println(--a);
        System.out.println(++a);

        System.out.println(a++);
        System.out.println(a++);

        System.out.println(a);
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(a--);

        System.out.println(--a);

        System.out.println("------------------------------------");

        int b = 99;
        System.out.println(++b);
        System.out.println("--------------------------------------");

        int c = 99;
        System.out.println(c++); // önce c yi verir sonra c yi 100 yapar. ama çıktı olarak 99 verir ama c 100 ile saklı
                                 //kalır
        System.out.println(c); // 100
        System.out.println(c++); //100 c=101
        System.out.println(c);


    }
}
