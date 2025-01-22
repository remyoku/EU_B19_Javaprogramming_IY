package day12_Switch_Case;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class C03_SwitchWeekDays {
    public static void main(String[] args) {

        System.out.println("Switch case stataement in Java");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz (1-7) : ");
        int day = scanner.nextInt();

        String günAdi = "";
        String günTipi = "";

        switch (day) {
            case 1:
                günAdi = "Pazartesi";
                break;
            case 2:
                günAdi = "Salı";
                break;
            case 3:
                günAdi = "Çarşamba";
                break;
            case 4:
                günAdi = "Perşembe";
                break;
            case 5:
                günAdi = "Cuma";
                break;
            case 6:
                günAdi = "Cumartesi";
                break;
            case 7:
                günAdi = "Pazar";
                break;
            default:
                System.out.println("Geçersiz gün bilgisi!!!!");

        }
        /////////////////////////////////////////////////////////////////////////////////////
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                günTipi = "Haftaiçi";
                break;
            case 6:
            case 7:
                günTipi="Haftasonu";
                break;
            default:
                System.out.println("Geçersiz Gün Bilgisi");
        }

        if (günAdi != ""){
            System.out.println("Haftanın "+ günAdi + " günüdür. Ve "+ günTipi+ " dir.");
        }


    }
}
