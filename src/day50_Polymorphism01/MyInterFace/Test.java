package day50_Polymorphism01.MyInterFace;

public class Test {
    public static void main(String[] args) {

        //non-polymorphic way

        ClassA a = new ClassA();
        ClassB b = new ClassB();

        // polymorphic way

        MyInterface obj1 = new ClassA();
        obj1.method();

        obj1 = new ClassB();

        MyInterface obj2 = new ClassB();
        obj2.method();

    }
}
