package day54_Collections_Queue_Set.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        System.out.println("que = " + que);

        //FIFO --- first in first out

        String name = que.remove().toLowerCase().toUpperCase().trim();

        System.out.println("name = " + name);
        System.out.println("que = " + que);

        // FIFO --- fist out - removes first element form the list

        name = que.poll();
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        //gets the first element in the order

        name = que.peek();
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        //Difference between pool and remove

        que.poll();
        System.out.println("que = " + que);
        que.poll();
        System.out.println("que = " + que);
        que.poll();
        System.out.println("que = " + que);


        try {
            que.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Hoop ! Your list is empty");
        }
    }
}
