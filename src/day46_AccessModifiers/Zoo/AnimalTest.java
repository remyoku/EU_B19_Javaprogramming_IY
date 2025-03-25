package day46_AccessModifiers.Zoo;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal("Kuş",3,"Sarı-Lacivert");
        System.out.println("animal = " + animal);
        animal.eat();
        animal.makeSound();

        Bird bird = new Bird("Maviş",2,"Mavi");
        bird.move();
        bird.makeSound();
    }
}
