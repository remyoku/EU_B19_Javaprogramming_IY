package day44_Inheritance_02.VehicleProject;

public class Car extends Vehicle {

    String model = "Unkonwn";

    public Car(String brand, String model) {
        this.model = model;
        super.brand = brand;
    }

    public void startEngineForCar(){
        System.out.println("Cars says : ");
        startEngine();
    }

    @Override
    public String toString() { //different class
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
