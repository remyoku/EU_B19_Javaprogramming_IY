package day43_Inheritance.MultiLevelInheritance;

public class Child extends Parent{

    int age ;

    public Child(String name , String lastName, int age){
        super(name,lastName);
        this.age = age;
    }
    public void miras(){
        System.out.println("Mirasım sizin değil vakıfın.");
    }

    public void display(){
        super.display();
        super.miras();
        System.out.println("age : " +age);
    }
}
