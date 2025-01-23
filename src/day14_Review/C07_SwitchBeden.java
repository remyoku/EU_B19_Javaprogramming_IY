package day14_Review;

import java.util.Scanner;

public class C07_SwitchBeden {
    public static void main(String[] args) {
        /*
        Bir program yazın switch yapısını kullanın
        beden numarası alsın
        small 38 , 40 , 42
        medium 44, 46 .48
        large 50, 52, 54
        excample output : 50 numara bir large bedendir.
         */

        Scanner veriGir = new Scanner(System.in);
        System.out.println("Lütfen Bir Beden Giriniz : ");
        int beden = veriGir.nextInt();

        switch (beden){
            case 38 , 40 , 42 :
                System.out.println(beden + " numara Small bedendir.");
                break;
            case 44 , 46 , 48:
                System.out.println(beden + " numara Medium bedendir.");
                break;
            case 50 , 52 , 54:
                System.out.println(beden + " numara Large bedendir.");
                break;
            default:
                System.out.println("Elimizde istediğiniz beden bulunmamaktadır.");
        }
    }
}
