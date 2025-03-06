package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class C08_Sort {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(99,23,15,45,34,235,1,32));

        System.out.println("sayilar.size() = " + sayilar.size());

        System.out.println("sayilar = " + sayilar);

        // How to sort the list by ascending?

        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // sayıları sıralar.



        ArrayList<Object> person = new ArrayList<>();
        person.add("İrem");
        person.add(1999);
        person.add(55.45);
        person.add(false);

        System.out.println("person = " + person);

        //descending olarak yeni bir array e atayın

        ArrayList<Integer> newNumber = new ArrayList<>();

        for (int i = sayilar.size()-1; i >=0 ; i--) {
            newNumber.add(sayilar.get(i));
        }
        System.out.println("newNumber = " + newNumber);
    }

}
