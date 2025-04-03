package day50_Polymorphism01.RunTime;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("Parent class printName methodu");
        System.out.println("Name  : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void makeSound();
}
