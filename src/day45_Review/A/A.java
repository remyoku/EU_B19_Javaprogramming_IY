package day45_Review.A;

public class A {
    int age = 5;
    static int boy = 175;
    String name;

    public A(int age , String name) {
        this.age=age;
        this.name=name;
        System.out.println("const : " + this.name);
    }

    static {
        System.out.println("Static blok");
        //static blok sadece bir kere çalışır.
    }
    {
        System.out.println("Blok " + this.name);
    }
}
