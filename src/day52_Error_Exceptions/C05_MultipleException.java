package day52_Error_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_MultipleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Lütfen bir sayı giriniz: ");
            int sayı = scanner.nextInt();

            System.out.print("Lütfen ikinci bir sayı(bölen) giriniz : ");

            int bölen = scanner.nextInt();

            int sonuc = sayı / bölen;
            System.out.println("sonuc = " + sonuc);
        }catch (ArithmeticException e){
            System.out.println("Aritmatic işlem hatası oluştu");
            System.out.println("0'a bölünme hatası");
            System.out.println("Exception class is =  " + e.getClass().getSimpleName());
        }catch (InputMismatchException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Hata oluştu : " + e);
        }finally {
            scanner.close();
            System.out.println("Finally bloc her durumda mutlaka çalışan bloktur.");
        }



    }
}
