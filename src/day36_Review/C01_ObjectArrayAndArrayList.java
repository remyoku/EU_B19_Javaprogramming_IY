package day36_Review;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class C01_ObjectArrayAndArrayList {

    public static void main(String[] args) {


        Object[] arr = {"İrem", LocalTime.of(8, 28), new Scanner(System.in), LocalDate.of(1998, 12, 9), "Eslem", 25, 35, 8};

        for (Object o : arr) {
            if (o instanceof String) {
                System.out.println("String : " + o);
            } else if (o instanceof Integer) {
                System.out.println("Integer : " + o);
            } else if (o instanceof Double) {
                System.out.println("Double : " + o);
            } else if (o instanceof Scanner) {
                System.out.print("Metin giriniz: ");
                String s = ((Scanner) o).nextLine();
                System.out.println("girilen text : " + s);
            } else if (o instanceof LocalTime) {
                int hour = ((LocalTime) o).getHour();
                System.out.println("Girilen saat :" + hour);
            } else if (o instanceof LocalDate) {
                DayOfWeek dayOfWeek = ((LocalDate) o).getDayOfWeek();
                System.out.println("Haftanın Günü : " + dayOfWeek);

            } else {
                System.out.println("Tanımlanamayan obje");
            }

        }
        System.out.println("--------------------------------------------------------");
        ArrayList<Object> list = new ArrayList<>();

        list.add("Ali");
        list.add(5);
        list.add(LocalDate.of(1453, 5, 29));
        list.add(true);

        for (Object o : list) {
            if (o instanceof String) {  // bu instanceof --> diyorum ki burda bu o da string üyesi var mı? varsa yaz
                System.out.println("String : " + o);
            } else if (o instanceof Integer) {
                System.out.println("Integer : " + o);
            } else if (o instanceof Double) {
                System.out.println("Double : " + o);
            } else if (o instanceof Scanner) {
                System.out.print("Metin giriniz: ");
                String s = ((Scanner) o).nextLine();
                System.out.println("girilen text : " + s);
            } else if (o instanceof LocalTime) {
                int hour = ((LocalTime) o).getHour();
                System.out.println("Girilen saat :" + hour);
            } else if (o instanceof LocalDate) {
                DayOfWeek dayOfWeek = ((LocalDate) o).getDayOfWeek();
                System.out.println("Haftanın Günü : " + dayOfWeek);

            } else {
                System.out.println("Tanımlanamayan obje");
            }
        }
    }
}
