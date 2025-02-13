package day25_Random_Math_Date_Class;

public class C05_MathClass {
    public static void main(String[] args) {

        System.out.println("Math.floor(9.2) = " + Math.floor(9.2)); //9.0
        System.out.println("Math.floor(9.8) = " + Math.floor(9.8));//9.0
        System.out.println("Math.floor(1.8) = " + Math.floor(1.8));//1.0

        double pi = Math.PI;
        System.out.println("pi = " + pi); //  22/7  3.141592653589793

        System.out.println("Math.abs(-3) = " + Math.abs(-3)); // 3
        System.out.println("Math.abs(3) = " + Math.abs(3)); // 3

        System.out.println("Math.max(50,28) = " + Math.max(50, 28)); // 50
        System.out.println("Math.min(50,28) = " + Math.min(50, 28)); // 28

        System.out.println("Math.pow(2,4) = " + Math.pow(2, 4));// 16

        System.out.println("Math.round(4.4) = " + Math.round(4.4));// 4
        System.out.println("Math.round(4.4) = " + Math.round(4.5));// 5

        System.out.println("Math.ceil(9.1) = " + Math.ceil(9.1)); //10

        System.out.println("Math.sqrt(169) = " + Math.sqrt(169)); //13

        System.out.println("Math.E = " + Math.E); // 2.718281828459045

        System.out.println("Math.random() = " + Math.random());
    }
}
