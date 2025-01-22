package day08_Assigment_Reletional_Logical_Operators;

public class C03_AssigmentOperators {
    public static void main(String[] args) {

        //decleration

        int num1 , num2;

        //'=' assignment operator

        num1 = 10;
        num2 = 5;

        // '+=' assigment operator

        num1 += num2; // --> num1 = num1 +num2;
        System.out.println("num1 = " + num1);

        // '-=' assigment operator

        num1 -= num2;
        System.out.println("num1 = " + num1);

        //'*='

        num1 *=num2;
        System.out.println("num1 = " + num1);

        // '/='
        num1 /= num2;
        System.out.println("num1 = " + num1);

        //'%='

        num1 %= num2;
        System.out.println("num1 = " + num1);

        String str ="Irem";
        String s = "Yokus";

        str += s; // --> str = str +s;
        str += s;
        System.out.println(str);

    }
}
