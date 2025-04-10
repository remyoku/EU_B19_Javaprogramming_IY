package day56_CollectionReview;

import java.util.*;

public class C05_Maps {
    public static void main(String[] args) {

        /**
         * collection framework e dahildirler.
         * primite data tipini desteklemezler
         * boyu dinamiktir.
         * keyler uniqe yani benzersiz olmalıdır.
         * valuelar duplicate olabilir
         *
         * HashMap  : key ve value null olabilir. Elementler random yerleşir.
         * LinkedHashMap : key ve value null olabilir. Elementlewr giriş sırasına göre yerleşir
         * TreeMap : key null olamaz ama value null olabilir.Elementler küçükten büyüğe sıralııdr.
         * HashTable : key ve value null olamaz.Elementler random  yerleşir.
         *
         */

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Ali");
        hashMap.put(20, "Ali");
        hashMap.put(30, "Ayla");
        hashMap.put(40, "Esra");
        hashMap.put(null, "Esra");
        hashMap.put(50, null);
        hashMap.put(null, null);
        hashMap.put(40, "Şeyma");

        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Ali");
        linkedHashMap.put(20, "Ali");
        linkedHashMap.put(30, "Ayla");
        linkedHashMap.put(40, "Esra");
        linkedHashMap.put(null, "Esra");
        linkedHashMap.put(50, null);
        linkedHashMap.put(null, null);
        linkedHashMap.put(40, "Şeyma");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ali");
        treeMap.put(20, "Ali");
        treeMap.put(30, "Ayla");
        treeMap.put(40, "Esra");
        //treeMap.put(null, "Esra");
        treeMap.put(50, null);
       //treeMap.put(null, null);
        treeMap.put(40, "Şeyma");

        System.out.println("treeMap = " + treeMap);

        Map<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(10,"Ali");
        hashTable.put(20,"Ali");
        hashTable.put(30,"Ayla");
        hashTable.put(40,"Esra");
        //hashTable.put(null,"Esra");
        //hashTable.put(50,null);
        //hashTable.put(null,null);
        hashTable.put(40,"Şeyma");
        hashTable.put(60,"İrem");
        hashTable.put(100,"Eslem");
        hashTable.put(3,"Ceren");

        System.out.println("hashTable = " + hashTable);
    }
}
