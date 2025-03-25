package day44_Inheritance_02.AnimalProject;

public class Animal {

    public Animal(){
        System.out.println("Animal a ait default const. çalıştı.");
    }
    public Animal(String sound){
        System.out.println("Animal a ait parametreli const. çalıştı : " + sound);
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
}
