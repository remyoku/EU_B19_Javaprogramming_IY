package day21_ReturnMethodOverLoading;

public class C06_MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(2, 5));



    }

    public static int sum(int num1, int num2) {  // isimle aynı olsa bile paraztez içindeki değişkenler değişik olmalı
        return num1 + num2;                      // yoksa hata verir
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int i, int i1,int i2) {
        return 0;
    }
    public static double sum(double a, double b , double c) {
        return a + b;
    }

}
// aynı parametre içerisinde