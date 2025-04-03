package day50_Polymorphism01.RunTime;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("I am a Dog and I make sound like 'hav-hav' ");
    }
}
