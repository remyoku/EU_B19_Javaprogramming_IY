package day27_StringClass2;

import java.util.Scanner;

public class C09_HarfKaldır {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String");
        String str = input.nextLine();
        System.out.println("Char");
        char ch = input.nextLine().charAt(0);

        String yeniKelime= "";

        for (int i = 0; i <str.length() ; i++) {


           if(str.charAt(i) != ch){
               yeniKelime+=str.charAt(i);
           }


        }
        System.out.println(str);
    }
}
//kullanıcıdan bir kelime ve bir harf alın
// kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız
//(merhaba , a) Merhb;
