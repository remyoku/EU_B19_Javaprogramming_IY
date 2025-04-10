package day56_CollectionReview;

import java.util.*;

public class C10_Java8ForEachMethod {
    public static void main(String[] args) {

        List<String > countries =new ArrayList<>(Arrays.asList("Almanya","Fransa","İspanya","Türkiye")) ;

        countries.forEach(element -> System.out.println(element));
        countries.forEach(e -> {
            if (e.startsWith("A")){
                System.out.println(e);
            }
        });

        System.out.println("--------------------------------------------------------");

        Map<String,Integer> students = new LinkedHashMap<>();
        students.put("Ali",60);
        students.put("İrem",100);
        students.put("Eslem",90);
        students.put("İkbal",80);
        students.put("Ömer",70);

        students.forEach((k,v)->System.out.println(k + "--> "+ v));

        System.out.println("----------------------------------------------------");

        students.forEach((k,v) -> {
            if (k.substring(k.length()-1).equals("m")){
                System.out.println(k + " --> " + v);
            }
        });
    }
}
