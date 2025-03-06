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

        System.out.println( "Yeni isim listesi : "   +  tekrarEdenIsımler(names));


    }
    public static ArrayList<String> tekrarEdenIsımler(ArrayList<String> list){
        ArrayList<String> ısımListesi = new ArrayList<>();
        
        for (String name  :list ) {
        		    if (!ısımListesi.contains(name)){
                        ısımListesi.add(name);
                    }
        		}
        Collections.sort(ısımListesi);
        return ısımListesi;
    }
}
//tekrar eden isimler silinecek..
//her isim sadece bir kere listede kalcak
// bu soruyu sort ile yapınız
//contains içeriyor mu
