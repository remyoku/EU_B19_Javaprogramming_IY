package day48_AbstracClass.Vehicle;

public class Bus extends Vehicle {


    public Bus(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " is stared");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " is stopped");
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " is driving");
    }

    @Override
    public void turnLeft(int angle) {

    }

    @Override
    public void turnRight() {

    }
}
