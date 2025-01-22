package day10_IfStatements;

public class C02_If_Cont {
    public static void main(String[] args) {
        int x=7;
        boolean a = (x<=5); //true

        if (a) {
            System.out.println(x + " 5 e eşit yada küçüktür.");
            System.out.println(x++);
        }
        System.out.println(x);
    }
}
