package day35_ArrayList;

import java.util.ArrayList;

public class C03_Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("london");
        cities.add("Virginia");
        cities.add("Washington");
        cities.add("Bakü");
        cities.add("Berlin");
        cities.add("Bakü");

        System.out.println(cities);
        System.out.println("-----------------------------------------------");

        for (String city  :cities ) {
            System.out.print(city+", ");
        		}
        System.out.println("\n-----------------------------------------------");

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + ", ");
        }
        System.out.println("\n-----------------------------------------------");

        cities.remove("Bakü");
        System.out.println(cities);

        System.out.println("-----------------------------------------------");

        cities.add("Hanburg");
        System.out.println(cities);

        System.out.println("-----------------------------------------------");

        cities.add(0,"İstanbul");
        System.out.println(cities);

        System.out.println("-----------------------------------------------");

        cities.set(cities.indexOf("Berlin"),"Munih" );//berlinin yerine munih ata dedik böyle
        System.out.println(cities);

        System.out.println("-----------------------------------------------");

        //clear();

        cities.clear(); // bütün verileri siliyor.
        System.out.println(cities);

    }
}
