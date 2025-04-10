package day56_CollectionReview;

import java.util.*;

public class C06_MapsMethods {
    public static void main(String[] args) {

        //put(key , value) : map e elemenet ekler
        //get(key) : key anahtarının value değerini döner
        //replace(key , value) : verilen key değerini değiştirir.
        //remove (key) : bu key ait girdiyi siler.
        //containsKey(key) : mapte böyle bir key varsa true döner.
        //containsValue(value) : mapte böyle bir value varsa true döner
        //isEmpty(): map boş ise true döner
        //equals(başka map) : iki map aynı ise true döner
        //clear(): map elementlerini siler

        //----------------------
        //keySet()  : keylerden oluşan bir set döner
        //values()  : valuelardan oluşan bir collection
        //entrySet(): key : value çift halinde döner

        Map<String,Integer> students = new LinkedHashMap<>();
         students.put("Ali",60);
         students.put("İrem",100);
         students.put("Eslem",90);
         students.put("İkbal",80);
         students.put("Ömer",70);

        System.out.println("students.entrySet() = " + students.entrySet());
        System.out.println("students = " + students);

        System.out.println("students.keySet() = " + students.keySet());
        System.out.println("students.values() = " + students.values());


        Collection<Integer> values = students.values();
        System.out.println("values = " + values);

        List<Integer> list = new ArrayList<>(values);
//        for (Integer i   : values ) {
//
//            list.add(i);
//        		}
        System.out.println("list = " + list);

        System.out.println("students.get(\"İrem\") = " + students.get("İrem"));
        System.out.println("students.size() = " + students.size());
        students.remove("Ali");
        System.out.println("students = " + students);

        System.out.println("students.containsKey(\"İkbal\") = " + students.containsKey("İkbal"));
        System.out.println("students.containsValue(55) = " + students.containsValue(55));

        students.replace("İrem",90);
        System.out.println("students = " + students);
        students.put("İrem",95);
        System.out.println("students = " + students);

    }
}
