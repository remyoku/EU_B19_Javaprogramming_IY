package day25_Random_Math_Date_Class;

import java.time.*;
import java.util.Date;

public class C07_DateTimeClass {
    public static void main(String[] args) {

        Date date = new Date();
        //Thread.sleep(1000);
        Date date2 = new Date();
        System.out.println("date.getTime() = " + date.getTime()); // 1 Ocak 1970 den bu yana geçen saniye sayısı

        long time = date.getTime();
        System.out.println("time = " + time);

        long time2 = date2.getTime();
        System.out.println("time2 = " + time2);

        if(time2 > time){
            System.out.println("Time2 daha sonra oldu.");
        }

        LocalDate tarih =LocalDate.now(); //şimdi
        System.out.println("tarih = " + tarih);

        //belirli bir tarih girmek istersek
        LocalDate tarih2 = LocalDate.of(2000,1,1);
        System.out.println("tarih2 = " + tarih2);

        LocalDate tarih3 = LocalDate.of(2000, Month.DECEMBER,1);
        System.out.println("tarih3 = " + tarih3);

        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear()); //yılın kaçıncı günü
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());// haftanın hangi günü
        System.out.println("tarih.plusMonths(3) = " + tarih.plusMonths(3));//ay ekleme
        System.out.println("tarih.getMonth() = " + tarih.getMonth()); // hangiay

        System.out.println("----------------------------------------------");

        LocalTime zaman = LocalTime.now();
        System.out.println("zaman = " + zaman);

        //belirli saati girelim
        LocalTime zaman2 =LocalTime.of(21,58,32);
        LocalTime zaman3 =LocalTime.of(23,58,32);
        System.out.println("zaman2 = " + zaman2);

        System.out.println("zaman.minusHours(2) = " + zaman.minusHours(2));

        System.out.println("LocalTime.now(ZoneId.of(\"Turkey\")) = " + LocalTime.now(ZoneId.of("Turkey")));
        System.out.println("LocalTime.now(ZoneId.of(\"Europe/London\")) = " + LocalTime.now(ZoneId.of("Europe/London")));

        System.out.println("zaman.isBefore(zaman3) = " + zaman.isBefore(zaman3));//true
        System.out.println("zaman3.isAfter(zaman3) = " + zaman3.isAfter(zaman3));//false

        System.out.println("zaman3.compareTo(zaman) = " + zaman3.compareTo(zaman)); //önce olunca 1 sonra olunca -1 aynı olunca 0

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);
    }
}
