package day52_Error_Exceptions;

public class C07_Throws_Keyword {

    public static void main(String[] args) throws InterruptedException {

        String str = "Java";

        System.out.println(str);
        sleep(2.1);
        /**
         * throws keyword u exception ı method ekleyerek handle eder
         */

          //  Thread.sleep(5000);


        String str2 = "C++";
        System.out.println(str2);
    }
    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long) seconds);
    }
}
