package day24_Reading_User_Input_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C06_ScannerFromTxtFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/day24_Reading_User_Input_Scanner/scanner.txt");

        Scanner sc = new Scanner(file);

        //toplamı saklamak için bir variable tanımlayalım
        int toplam = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int sayi = sc.nextInt();
                toplam += sayi;
                System.out.println("Sayı bulundu : " + sayi);
            } else {
                String satir = sc.nextLine();
                System.out.println("Integer olmayan değer : " + satir);
            }
        }

        System.out.println("toplam = " + toplam);
    }
}
