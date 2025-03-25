package day46_AccessModifiers.Zoo;

public non-sealed class Bird extends Animal{

    public Bird() {
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void move() {
        System.out.println("I am a bird. And I can run with my two legs.");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a bird. I make sound Cik-Cik.");
    }
    public void fly(){
        System.out.println("I am a bird. I can fly.");
    }

    @Override
    public String toString() {
        String str = "I am a bird : \n";
        str += "My name is : "+getName();
        str += "My age is : " + getAge();
        str +="My color is : " + getColor();
        return str;
    }
}
