package day08_Assigment_Reletional_Logical_Operators;

public class C13_LogicalORveANDOperator {
    public static void main(String[] args) {

        //AND && ve & için

        int a = 20;
        int b = 30;
        int c = 40;

        System.out.println((a > b) && (a++ < c)); // burda çiftlisi (&&) olunca ilk kısımda false u görünce
                                                 // ikinci tarafı hiç çalıştırmıyor dolayısıyla a ++ değerini almıyor
                                                // çıktı false olup a 20 de kalmaya devam ediyor.
        System.out.println(a);

        int a1 = 20;
        int b1 = 30;
        int c1 = 40;

        System.out.println((a1 > b1) & (a1++ < c1)); // burda da tekli (&) olunca ilk kısımda false görse bile
                                                    // ikinci kısmı çalıştırıyor ve a ++ değer alıyor.
                                                   // çıktı false olup a 21 değerini alıyor.
        System.out.println(a1);




        //OR || ve | için

        int a2 = 20;
        int b2 = 30;
        int c2 = 40;

        System.out.println((a2 < b2) || (a2++ < c2));
        System.out.println(a2);

        int a3 = 20;
        int b3 = 30;
        int c3 = 40;

        System.out.println((a3 < b3) | (a3++ < c3));
        System.out.println(a3);




    }
}
