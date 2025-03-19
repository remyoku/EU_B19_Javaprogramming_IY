package day43_Inheritance.MultiLevelInheritance;

public class Parent extends GrandParent {

    public String lastName;

    public Parent(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public void display() {
        super.display();
        miras();
        System.out.println("Lastname : " + lastName);
    }
}
