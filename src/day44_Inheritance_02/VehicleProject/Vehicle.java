package day44_Inheritance_02.VehicleProject;

public class Vehicle {

    String brand = "Generic Vehicle";

    public  Vehicle(){
        System.out.println("Vehicle defoult const.");
    }
    public void startEngine(){
        System.out.println("Engine is started...");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
