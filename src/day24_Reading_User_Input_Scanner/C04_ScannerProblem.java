package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C04_ScannerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz : ");
        //25 + enter  \n
        int age = input.nextInt();

        input.nextLine();  // nextInt() ve diğer next metotlarından sonra klavye ön belleği temizlenmeden
        // string değer girişi yapılırsa, son giriş değeri \n olduğu için bu değer stringe atanır
        // yeni değer alınamaz..


        System.out.print("Adınızı giriniz : ");
        String name = input.nextLine();

        System.out.println("Adınız : " + name + " Yaşınız : " + age);

        System.out.print("Adınızı tekrar giriniz : ");
        name = input.nextLine();

        System.out.println("Adınız : " + name + " Yaşınız : " + age);
    }
}
