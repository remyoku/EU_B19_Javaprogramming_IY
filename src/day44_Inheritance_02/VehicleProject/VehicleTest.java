package day44_Inheritance_02.VehicleProject;

public class VehicleTest {
    public static void main(String[] args) {

        Car mycar = new Car("MG","ZS");
        System.out.println("mycar.toString() = " + mycar.toString());
        mycar.startEngineForCar();



        System.out.println();

        Truck myTruck = new Truck("abc","8 damperli");
        System.out.println("myTruck.toString() = " + myTruck.toString());
    }
}
