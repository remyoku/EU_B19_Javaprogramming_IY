package day34_WrapperClasses;

import java.util.Scanner;

public class C03_ScannerInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Lütfen Yaşınızı Giriniz: " );
        int yas = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Lütfen Adınızı Giriniz: ");
        String ad = scanner.nextLine();

        System.out.println(ad + " " + yas + " yaşındadır.");*/

        System.out.println("Lütfen Yaşınızı Giriniz: ");
        int yas = Integer.parseInt(scanner.nextLine());

        System.out.println("Lütfen Kilonuzu Giriniz: ");
       // double kilo = Double.parseDouble(scanner.nextLine());
        double kilo = Double.valueOf(scanner.nextLine());


        System.out.println("Lütfen Adınızı Giriniz: ");
        String ad = scanner.nextLine();
        System.out.println(ad + " " + yas + " yaşındadır.");

    }
}
