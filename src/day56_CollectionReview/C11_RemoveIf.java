package day56_CollectionReview;

import java.util.*;

public class C11_RemoveIf {
    public static void main(String[] args) {

        List<String > countries =new ArrayList<>(Arrays.asList("Almanya","Arnavutluk","Fransa","İspanya")) ;

        System.out.println("countries = " + countries);

        countries.removeIf(x -> x.charAt(0) == 'A');



        System.out.println("countries = " + countries);
        System.out.println("----------------------------------------------------------------------");

        Map<String,Integer> students = new LinkedHashMap<>();
        students.put("Ali",60);
        students.put("İrem",100);
        students.put("Eslem",90);
        students.put("İkbal",80);
        students.put("Ömer",70);
        Map<String,Integer> goodStudents = new LinkedHashMap<>();

        students.forEach((k,v) -> {
            if (v>80){
                goodStudents.put(k,v);
            }
        });
        System.out.println("goodStudents = " + goodStudents);

      //  students.values().removeIf(v -> v<80);
        students.keySet().removeIf(k -> k.startsWith("A"));

        System.out.println("students = " + students);
    }
}
