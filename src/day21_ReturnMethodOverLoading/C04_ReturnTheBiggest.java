package day21_ReturnMethodOverLoading;

public class C04_ReturnTheBiggest {
    public static void main(String[] args) {

        biggerNumbers(25, 16);
        System.out.println("----------------------------------------");
        System.out.println(biggerNumber1(65, 22));

    }

    public static void biggerNumbers(int number1, int number2) {

        if (number1 > number2) {
            System.out.println("Büyük sayı : " + number1);
        } else {
            System.out.println("Büyük sayı : " + number2);
        }



    }

    public static int biggerNumber1(int num1, int num2) {
        return num1> num2?num1 : num2;
    }
}
//a method that returns the biggest number of two numbers