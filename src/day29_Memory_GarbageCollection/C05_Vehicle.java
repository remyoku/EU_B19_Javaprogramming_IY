package day29_Memory_GarbageCollection;

public class C05_Vehicle {

    // referans değişken
    String brandname;
    String model;
    int year;
    static int counter;


    public void finalize(){
        System.out.println(counter++);
        System.out.println("*** Garbage Collection run ***");
    }
}
