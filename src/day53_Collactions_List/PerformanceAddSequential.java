package day53_Collactions_List;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceAddSequential {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###");
        int numberOfElement = 20_000_000;
        long startTime;
        long endTime;
        long duration;


        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Adding data sequenctially");
        System.out.println("-------------------------------");

        System.out.println("Arraylist sequantial adding performance");

        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElement; i++) {
            arrayList.add(i);
        }
        System.out.println("Elements added successfully");
        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("Duration of  " + df.format(numberOfElement) + " element sequential to Arraylist  " +df.format(duration)+ " nano seconds");

        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("Linkedlist sequantial adding performance");

        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElement; i++) {
           linkedList.add(i);
        }
        System.out.println("Elements added successfully");
        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("Duration of  " + df.format(numberOfElement) + " element sequential to Linkedlist  " +df.format(duration)+ " nano seconds");

        System.out.println("Arraylist Adding (inserting) data with index");
        //ArrayList inserting elements

        int index = 5000;
        startTime = System.nanoTime();
        arrayList.add(index,35098);
        arrayList.add(index,35098);
        arrayList.add(index,35098);
        arrayList.add(index,35098);
        arrayList.add(index,35098);

        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("Duration of inserting elements to ArrayList  : " + df.format(duration) + " nano seconds.");

        System.out.println("Linkedlist Adding (inserting) data with index");
        //Linkedlist inserting elements

        index = 5000;
        startTime = System.nanoTime();
        linkedList.add(index,35098);
        linkedList.add(index,35098);
        linkedList.add(index,35098);
        linkedList.add(index,35098);
        linkedList.add(index,35098);


        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("Duration of inserting elements to Linkedlist  : " + df.format(duration) + " nano seconds.");
    }
}
