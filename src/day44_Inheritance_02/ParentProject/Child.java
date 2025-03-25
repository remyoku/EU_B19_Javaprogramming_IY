package day44_Inheritance_02.ParentProject;

public class Child extends Parent{

    public void greet(){
        System.out.println("Hello from child class");
    }
    public void displayInfo(String message , int age) {
        System.out.println("Child info : " + message);
    }
}
