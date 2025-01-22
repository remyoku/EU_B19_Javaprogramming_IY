package day08_Assigment_Reletional_Logical_Operators;

public class C08_LogicalAND {
    public static void main(String[] args) {

        // and de her iki seçeneğinde true olması lazım.
        // AND --> (2<3)&&(3<4) ==> if both of operands are true

        System.out.println(!(2==3));

        /*
        true && true ==> true
        true && false ==> false
        false && true ==> false
        false && false ==> false
        AND operator sonucun true çıkması için her iki tarafında true olması lazım.
        bir tane bile false varsa cevap false çıkar.
         */

        System.out.println(true && true); //true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        int i1 = 15;
        int i2 = 10;

        // tekli operand
        boolean result1 = (i1 > i2) & (i1 <= i2);
        System.out.println("result1 = " + result1); //false

        //çiftli operand
        boolean result2 = (i1 != i2) && (i1 >= i2);
        System.out.println("result2 = " + result2); //true

        //tek operator ile çift operator arasındaki fark sonuçla ilgili değildir
        //performans ile ilgilidir.

    }
}
