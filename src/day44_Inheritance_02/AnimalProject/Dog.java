package day44_Inheritance_02.AnimalProject;

public class Dog extends Animal {


    public Dog() {

        System.out.println("Dog a ait default const. çalıştı.");
    }

    public Dog(String sound) {
        this();

        System.out.println("Dog a ait parametreli const. çalıştı : " + sound);

    }

    public Dog(String sound , int age){
        this(sound);
        System.out.println("Dog a ait iki parametreli const. çalıştı : "+sound +" age : "+ age);
    }
    public void bark() {
        System.out.println("Dog is barking.");
    }
}
