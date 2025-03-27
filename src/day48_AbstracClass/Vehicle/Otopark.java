package day48_AbstracClass.Vehicle;

import java.util.ArrayList;

public class Otopark {

    private String name ;
    private String adress;

    private ArrayList<Vehicle> vehicles;

    public Otopark(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void listOfVehicle(){
        System.out.println(name);
        System.out.println(adress);
        System.out.println("--------------------------");
        System.out.println("Otoparkta toplam  " + vehicles.size()+ " araç var");
        System.out.println("Otoparktaki araçların listesi");
        System.out.println("--------------------------");

        for (Vehicle vehicle  : vehicles ) {
            System.out.println(vehicle);

        		}
    }

    public void numberOfVehicleByType(){

        int sedan = 0;
        int bus = 0;

        for (Vehicle vehicle  : vehicles ) {
            if (vehicle instanceof Sedan){
                sedan++;
            }
            if (vehicle instanceof Bus){
                bus++;
            }
        }
        System.out.println("Number of Sedan Type vehicle is  = " + sedan);
        System.out.println("Number of Bus Type vehicle is  = " + bus);
    }
}
