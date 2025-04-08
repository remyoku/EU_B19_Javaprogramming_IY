package day54_Collections_Queue_Set.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue priority = new PriorityQueue();

        priority.add(12);
        priority.add(15);
        priority.add(5);
        priority.add(6);
        priority.add(25);
        priority.add(35);// duplicate veri kabul eder
        priority.add(35);
        priority.add(123);
        priority.add(1000);
        priority.add(-12);


        //sıralama karışık gelirr en küçük en öne gelir.
        System.out.println("priority = " + priority);

        System.out.println("priority.peek() = " + priority.peek());
        System.out.println("priority.poll() = " + priority.poll());

        System.out.println("priority = " + priority);

        System.out.println("priority.peek() = " + priority.peek());
        System.out.println("priority.poll() = " + priority.poll());

        System.out.println("priority = " + priority);

        System.out.println("priority.peek() = " + priority.peek());
        System.out.println("priority.poll() = " + priority.poll());

        System.out.println("priority = " + priority);

        while (!priority.isEmpty()){
            System.out.println("priority.poll() = " + priority.poll());
        }


        //Doğla sıralama alfabetik olarak dataları bize verir.
        PriorityQueue<String> strs = new PriorityQueue<>();

        strs.add("Zab");
        strs.add("Aab");
        strs.add("Bab");
        strs.add("aab");
        strs.add("Aaa");
        strs.add("Aba");
        strs.add("Aab");//duplicate kabul eder

        System.out.println();
        System.out.println("strs.poll() = " + strs.poll());
        System.out.println("strs.poll() = " + strs.poll());
        System.out.println("strs.poll() = " + strs.poll());
        System.out.println("strs.poll() = " + strs.poll());
        System.out.println("strs.poll() = " + strs.poll());
        System.out.println("strs.poll() = " + strs.poll());
        System.out.println("strs.poll() = " + strs.poll());
    }
}
