package day49_Interface_Enum_DataClass.AnimalClass;

public class AnimalTest {
    public static void main(String[] args) {
        Bird bird = new Bird("Tweety",2);
        bird.eat();
        bird.fly();
        bird.swim();
        bird.printInfo();

        System.out.println();

        Frog frog = new Frog("Kermit",15);
        frog.eat();
        frog.run();
        frog.sleep();
        frog.swim();
        frog.printInfo();
        System.out.println(frog);

        Flyable.staticMethod();
        bird.defaultMethod();
    }


}
