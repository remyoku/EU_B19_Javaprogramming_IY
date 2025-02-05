package day20_CustomMethods;

public class C02_CustomMethodpractice {
    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("------------------------------");
        countDownTenToZero();
        System.out.println();
        System.out.println("------------------------------");

        countDownTenToZero2();
        System.out.println();
        System.out.println("------------------------------");
        evenNumber();
        System.out.println();
        System.out.println("------------------------------");

        evenNumber2();


    }

    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) { // initialitation -- condition -- increment or decrement
            System.out.println("Hello World");

        }
    }
    // bir method yazın 10 dan 0 a kadar rakamları yazdırsın

    public static void countDownTenToZero() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void countDownTenToZero2() {

        int i = 10;
        while (0 < i) {
            ;
            System.out.print(i + " ");
            i--;
        }
    }

    // 0 ile 100 arasındaki çift sayıları yazdırın.

    public static void evenNumber(){

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }
    }

    public static void evenNumber2(){
        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i + " ");

        }

    }
}