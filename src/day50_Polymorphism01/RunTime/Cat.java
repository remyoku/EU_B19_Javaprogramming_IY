package day50_Polymorphism01.RunTime;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("I am a Cat and I make sound like 'meow-meow' ");
    }

    public  void tirmala(){
        System.out.println("Ben bir kediyim. Beni kızdırırsan tırmalarım.");
    }

}
