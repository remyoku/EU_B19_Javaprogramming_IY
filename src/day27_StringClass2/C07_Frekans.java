package day27_StringClass2;

import java.util.Scanner;

public class C07_Frekans {
    public static void main(String[] args) {
        // String str = "AABACCCDC";
        // char ch = 'C';

        //for ve if
        //birinci karakterden sonuncu karaktere kadar al
        //sonra if ile c ye eşit mi değil mi kontrol et.
        // eşitlik varsa bir sayı olacak ve artacak

        Scanner input = new Scanner(System.in);
        System.out.println("String");
        String str = input.nextLine();
        System.out.println("Char");
        char ch = input.nextLine().charAt(0);

        int frekans = 0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                frekans+=1;

            }

        }
        System.out.println("frekans = " + frekans);
    }
}
