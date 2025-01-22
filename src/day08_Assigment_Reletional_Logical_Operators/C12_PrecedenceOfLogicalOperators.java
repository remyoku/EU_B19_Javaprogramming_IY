package day08_Assigment_Reletional_Logical_Operators;

public class C12_PrecedenceOfLogicalOperators {
    public static void main(String[] args) {

        /**
         * highest
         * !
         * &&
         * ||
         * lowest
         */

        int i1 = 10;
        int i2 = 15;
        int i3 = 20;

        boolean check = i1 != i2 || !(i1 == i3) && i2 ==i3;
                      //     T   || !(F) &&  F
                      //     T   || T    &&  F
                      //     T   ||  F   =>  T
        System.out.println("check = " + check); // TRUE
    }
}
