package day48_AbstracClass.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {


       // Vehicle vehicle = new Vehicle("Mercedes","E200",2024,"Grey");
        // bu class abstrac olduğu için bununla bir obje oluşturamazsın

        Bus bus = new Bus("Mercedes","Maraton",2021,"Black");
        bus.start();
        bus.stop();
        bus.drive();
        System.out.println(bus);

        Sedan sedan = new Sedan("Honda","Accord",2021,"White");
        sedan.start();
        sedan.stop();
        sedan.drive();
    }
}
