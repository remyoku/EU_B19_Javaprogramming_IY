package day30_Arrays01;

import java.util.Scanner;

public class C08_AlisVeris {
    public static void main(String[] args) {

        // Dongu kullanarak, kullanicidan urunleri almak kaydiyla bir urun listesi olusturunuz
        // array oluştur
        // kullanıcıdan birürün al her seferinde.

        System.out.println("Alışveriş Listesi .....");

        String [] sepet = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen sepetinize ürün ekleyiniz....");

        for (int i = 0; i <sepet.length ; i++) {
            System.out.println(i+1+ ". ürün");
            sepet [i] = sc.nextLine();
        }

        System.out.println("Seçtiğiniz ürün listesi...");

        for (int i = 0; i <sepet.length; i++) {
            System.out.println(i+1+". ürün : "+ sepet[i]);

        }

    }
}
