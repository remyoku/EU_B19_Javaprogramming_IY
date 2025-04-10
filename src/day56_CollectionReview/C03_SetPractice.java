package day56_CollectionReview;

import java.util.*;

public class C03_SetPractice {
    public static void main(String[] args) {
        /**
         * setler duplicate veri kabul etmez(aynı veriryi iki kere kabul etemz.)
         *
         */

        Set<Integer> hashSet = new HashSet<>();
        //içine veriyi random yerleştirir.
        hashSet.addAll(Arrays.asList(100,1,2,0,25,-3,25,21,25));

        System.out.println("hashSet = " + hashSet);

        Set<Integer> linkedSet = new LinkedHashSet<>();
        //içinde veri nasıl giirdiyse o sırayla yerleştirir.
        linkedSet.addAll(Arrays.asList(100,1,2,0,25,-3,25,21,25));
        System.out.println("linkedSet = " + linkedSet);


        Set<Integer> treeSet = new TreeSet<>();
        //içinde veri küçükten büyüğe sırayla yerleştirir.
        treeSet.addAll(Arrays.asList(100,1,2,0,25,-3,25,21,25));
        System.out.println("treeSet = " + treeSet);

        for (Integer aranan  :linkedSet ) {
        		    if (aranan==25){
                        System.out.println("Bulundu");
                    }
        		}
        ArrayList<String> countries = new ArrayList<>(){
            {
                add("Türkiye");
                add("Türkiye");
                add("Almanya");
                add("İsveç");

            }
        };
        System.out.println("countries = " + countries);

        Set<String> countrySet = new HashSet<>(countries);
        System.out.println("countrySet = " + countrySet);

        countrySet.add("Almanya"); //boolean , eğer varsa foalse döner eklemez
        countrySet.add("Rusya");// yoksa true döner ve ekler
        System.out.println("countrySet = " + countrySet);
    }
}
