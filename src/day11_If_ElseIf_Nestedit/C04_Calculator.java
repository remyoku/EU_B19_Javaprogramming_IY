package day11_If_ElseIf_Nestedit;

import java.util.Scanner;

public class C04_Calculator {
    public static void main(String[] args) {

         //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,*,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.

       /* Scanner input = new Scanner(System.in);
        System.out.println("1.Sayı giriniz: ");
        double sayı1 = input.nextDouble();
        System.out.println("2.Sayı notunuzu giriniz: ");
        double sayı2 = input.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi belirtin: ");
        String işlem = input.next();

        if (işlem.equals("+") ){
            System.out.println(sayı1+sayı2);
        } else if (işlem.equals("-")) {
            System.out.println(sayı1-sayı2);
        } else if (işlem.equals("*")) {
            System.out.println(sayı1 * sayı2);
        } else if (işlem.equals("/")) {
            System.out.println(sayı1/sayı2);
            if(sayı2==0){
                System.out.println("Sayı 2 tekrara giriniz 0 girdiniz");
                sayı2 = scanner.nextDouble();
            }
        }else {
            System.out.println("Hatalı işlem girdiniz");
        }*/


        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı 1: ");
        double sayi1=scanner.nextDouble();
        System.out.println("Sayi 2");
        double sayi2= scanner.nextDouble();


        System.out.println("Lütfen yapılacak olan işlemi giriniz : ");
        String islem= scanner.next();

        // islem == + - * /

        if (islem.equals("+")){
            System.out.println(sayi1+sayi2);
        } else if (islem.equals("-")) {
            System.out.println(sayi1-sayi2);
        } else if (islem.equals("*")) {
            System.out.println(sayi1*sayi2);
        } else if (islem.equals("/")) {
            if(sayi2==0){
                System.out.println("Sayi 2 tekrar giriniz 0 girdiniz");
                sayi2= scanner.nextDouble();
            }
            System.out.println(sayi1/sayi2);
        }else {
            System.out.println("Hatalı islem girdiniz");
        }


    }
}
