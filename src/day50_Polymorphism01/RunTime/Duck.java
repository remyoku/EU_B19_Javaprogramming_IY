package day50_Polymorphism01.RunTime;

import java.util.SortedMap;

public class Duck extends Animal{

    public Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("I am a Duck and I make sound like 'vak-vak' ");
    }

    @Override
    public void printName() {
        System.out.println("Duck class printName methodu");
        System.out.println(getName().toUpperCase());
    }

    public void fly(){
        System.out.println("I am a duck and I can fly");
    }
}
