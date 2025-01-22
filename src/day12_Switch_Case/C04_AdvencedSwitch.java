package day12_Switch_Case;

import java.util.Scanner;

public class C04_AdvencedSwitch {
    public static void main(String[] args) {

        System.out.println("Switch case stataement in Java");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz (1-7) : ");
        int day = scanner.nextInt();

        String günAdi = "";
        String günTipi = "";

        switch (day) {
            case 1 -> günAdi = "Pazartesi";
            case 2 -> günAdi = "Salı";
            case 3 -> günAdi = "Çarşamba";
            case 4 -> günAdi = "Perşembe";
            case 5 -> günAdi = "Cuma";
            case 6 -> günAdi = "Cumartesi";
            case 7 -> günAdi = "Pazar";
            default -> System.out.println("Geçersiz gün bilgisi!!!");
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> günTipi = "Haftaiçi";
            case 6, 7 -> günTipi = "Haftasonu";
            default -> System.out.println("Geçersiz gün bilgisi!!!");
        }

        if (günAdi != "") {
            System.out.println("Haftanın " + günAdi + " günüdür. Ve " + günTipi + "'dir.");
        }
    }
    // bu da kısa yol break yazmadan kestirmeden.
}

