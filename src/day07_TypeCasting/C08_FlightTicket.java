package day07_TypeCasting;

import java.util.Scanner;

public class C08_FlightTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen uçuşun başladığı şehiri giriniz : ");
        String fromCity = input.nextLine();

        System.out.println("Lütfen varış noktası olan şehiri giriniz : ");
        String toCity = input.nextLine();

        System.out.println("Lütfen bilet ücretini giriniz : ");
        int ticketPrice = input.nextInt();

        System.out.println("fromCity = " + fromCity);
        System.out.println("toCity = " + toCity);
        System.out.println("ticketPrice = " + ticketPrice);
        System.out.println("\"From Ankara to Istanbul is 599TL\"");

    }
}
