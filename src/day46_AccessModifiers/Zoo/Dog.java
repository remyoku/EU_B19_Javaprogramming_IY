package day46_AccessModifiers.Zoo;

public non-sealed class Dog extends Animal {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void move() {
        System.out.println("I am a dog. I can run.");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a dog. I make sound Hav- Hav.");
    }

    @Override
    public String toString() {
        String str = "I am a dog : \n";
        str += "My name is : "+getName();
        str += "My age is : " + getAge();
        str +="My color is : " + getColor();
        return str;
    }
}
