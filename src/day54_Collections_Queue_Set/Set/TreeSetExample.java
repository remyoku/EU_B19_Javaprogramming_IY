package day54_Collections_Queue_Set.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String > treeSet = new TreeSet<>();
        treeSet.add("Mavi");
        treeSet.add("Yeşil");
        treeSet.add("Gri");
        treeSet.add("Sarı");
        treeSet.add("Beyaz");
        treeSet.add("10");
        treeSet.add("555");
        treeSet.add("Mavi");
        treeSet.add("&");

        System.out.println("treeSet = " + treeSet);

        for (String str  :treeSet ) {
            System.out.println("str.hashCode() = " + str.hashCode());
        }
        System.out.println();

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(24);
        treeSet1.add(4);
        treeSet1.add(34);
        treeSet1.add(14);
        treeSet1.add(14);//duplicate kabul etmez

        System.out.println("treeSet1 = " + treeSet1);


    }
}
