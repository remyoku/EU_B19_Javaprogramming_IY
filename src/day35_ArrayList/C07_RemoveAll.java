package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_RemoveAll {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a","b","c","z")); // add demek yerine böyle de yapabiliriz.
        System.out.println("list1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30,12,22));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(233,30,345,12,22,30,678));

        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

        list3.removeAll(list2); //list2 içerisinde ki elemanları list3ten siler.
        System.out.println("list3 = " + list3);

    }
}
