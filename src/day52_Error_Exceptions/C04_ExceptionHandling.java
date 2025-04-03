package day52_Error_Exceptions;

public class C04_ExceptionHandling {
    public static void main(String[] args) {

        //ctrl + alt + t
        /**
         * Basic try -catch syntax
         */

        try {
            //codes which are monitored
            // codes that throus exception
        } catch (Exception e) {  // () hatanın türü ve objesi verilir
            //handling the exception
        }

        int sayiA = 35;
        int sayiB = 0;

        System.out.println("Division test is started.");

        int sonuc = 0;

        try {
            sonuc = sayiA / sayiB;
        } catch (ArithmeticException e) {
            System.out.println("---------- Hata ismi: " + e.getMessage());
            System.out.println("---------- Bölme işleminde bir hata oluştu.");

        } catch (Exception e) {
            e.printStackTrace();
            sayiB = 1;
            sonuc = sayiA / sayiB;

        }
        System.out.println("sonuc = " + sonuc);

        System.out.println("Division test is finished");

        System.out.println("Addition test is started");

        sonuc = sayiA + sayiB;

        System.out.println("sonuc = " + sonuc);

        System.out.println("Addition test is finished");
    }
}
