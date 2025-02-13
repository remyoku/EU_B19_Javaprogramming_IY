package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C07_ScannerWithPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("E-mailinizi giriniz : ");

        String kalip = ".*@.*\\..*";  //regex -- regular expression

        String email = scanner.next(kalip);

        System.out.println("Geçerli e-posta adresi : " + email);

        String telKalip =  "\\d{3}-\\d{3}-\\d{4}";
        System.out.print("Tel no giriniz : ");

        String tel = scanner.next(telKalip);

        System.out.println("tel = " + tel);

    }

}
