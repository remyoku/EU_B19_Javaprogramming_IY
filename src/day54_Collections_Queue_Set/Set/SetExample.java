package day54_Collections_Queue_Set.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> myset = new HashSet<>();

        myset.add(10);
        myset.add(20);
        myset.add(30);
        myset.add(50);
        myset.add(100);
        myset.add(100);
        myset.add(100);

        System.out.println("myset = " + myset);
        System.out.println("myset.size() = " + myset.size());


        List<String> list = Arrays.asList("15", "15", "a", "c", "tt", "%", "c");

        System.out.println("list = " + list);

        Set<String> mySet2 = new TreeSet<>(list); // Listi sete atabiliriz. duplicate veriler gider.

        System.out.println("mySet2 = " + mySet2);

        //////////////////////////////////////////////////////////

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(500);
        treeSet.add(100000000);
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(900156);
        treeSet.add(100);

        System.out.println("treeSet = " + treeSet);

        System.out.println("treeSet.add(100) = " + treeSet.add(100));
        System.out.println("treeSet.add(60) = " + treeSet.add(60));
        System.out.println("treeSet = " + treeSet);

        Iterator<Integer> iterator = treeSet.iterator();
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num > 1000) {
                iterator.remove();
            }

        }

        System.out.println("treeSet = " + treeSet);
    }


}
