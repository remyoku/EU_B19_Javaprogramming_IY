package day53_Collactions_List.Vektor;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListMultiThread {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vektor = new Vector<>();

        arrayList.add(123);
        arrayList.add(23);
        arrayList.add(12312345);
        System.out.println("arrayList = " + arrayList);

        System.out.println();

        vektor.add(6352416);
        vektor.add(2416);
        vektor.add(63);
        System.out.println("vektor = " + vektor);

        System.out.println();

        //Multi -thread element adding to ArrayList and Vektor

        List<Integer> multiThreadArrayList = new ArrayList<>();
        List<Integer> multiThreadVector = new Vector<>();

        //Two thread created t1 and t2
        //Each thread  adds element to same ArrayList

        Thread t1 = new Thread(() -> {
            int counter = 0;
            System.out.println("Thread -1 ");
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadArrayList.add(i);
                counter ++;

            }
            System.out.println("Number of element that added Thread 1 : " + counter);
        });


        Thread t2 = new Thread(() -> {
            int counter = 0;
            System.out.println("Thread -2 ");
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadArrayList.add(i);
                counter++;
            }
            System.out.println("Number of element that added Thread 2 : " + counter);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("multiThreadArrayList.size() = " + multiThreadArrayList.size());

        System.out.println("-----------------------------------------------------------------------------------------");

        //Two thread created t1 and t2
        //Each thread  adds element to same Vector

        System.out.println("Vector multi - Thread");

        t1 = new Thread(() -> {
            int counter = 0;
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadVector.add(i);
                counter ++;
            }
            System.out.println("Vector Thread  -1 number of adding : " + counter);
        });

        t2 = new Thread(() -> {
            int counter = 0;
            for (int i = 0; i < 1_000_000; i++) {
                multiThreadVector.add(i);
                counter ++;
            }
            System.out.println("Vector Thread  -2 number of adding : " + counter);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("multiThreadVector.size() = " + multiThreadVector.size());
    }
}
