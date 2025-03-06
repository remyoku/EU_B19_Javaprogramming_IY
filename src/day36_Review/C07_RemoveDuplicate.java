package day36_Review;

import java.util.ArrayList;
import java.util.Collections;

public class C07_RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("John");
        names.add("Smith");
        names.add("John");
        names.add("Smith");
        names.add("Mary");
        names.add("Jack");
        names.add("Mary");
        names.add("Smith");
        names.add("John");

        System.out.println("names = " + names);

        //Collections.sort(names);
       //System.out.println("names = " + names);
    }
    //tekrar eden isimler silinecek..
    //her isim sadece bir kere listede kalcak
    // bu soruyu sort ile yapınız

}
