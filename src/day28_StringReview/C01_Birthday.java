package day28_StringReview;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01_Birthday {
    public static void main(String[] args) {

        //Doğum gününüzü belirtilen formata göre girdiğinizde
        //Haftanın hangi günü(Monday-Sunday) doğduğunuzu gösteren kodu yazınız.

        System.out.println("Doğum Gününüzü yyyy-MM-dd formatında giriniz : ");
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();

        //Girilen stringi Tarih bilgisine dönüştürelim.
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("Your birthday "+dateStr+" is on "+dayOfWeek);

        System.out.println("------------------------------------------------");

        //Doğum gününüzü belirtilen formata göre girdiğinizde
        //Haftanın hangi günü(Monday-Sunday) doğduğunuzu gösteren kodu yazınız.

        System.out.println("Doğum Gününüzü dd/MM/yyyy formatında giriniz : ");

       dateStr = sc.nextLine();

        //Girilen stringi Tarih bilgisine dönüştürelim.
        date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        dayOfWeek = date.getDayOfWeek();

        System.out.println("Your birthday "+dateStr+" is on "+dayOfWeek);

        System.out.println("------------------------------------------------");
    }
}
