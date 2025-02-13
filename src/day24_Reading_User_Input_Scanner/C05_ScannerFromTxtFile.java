package day24_Reading_User_Input_Scanner;

import  java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class C05_ScannerFromTxtFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/day24_Reading_User_Input_Scanner/scanner.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNext()){  //burada bir değer var mı diye soruyoruz?
            System.out.println(sc.next()); // next diğerine geç oluyor bu da

        }

    }
}
