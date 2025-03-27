package day48_AbstracClass.Vehicle;

public class OtoparkTest {
    public static void main(String[] args) {

        Otopark otopark = new Otopark("Katlı Otopark","Kurtuluş,Ankara");

        Sedan sedan = new Sedan("Mercedes","e200",2021,"Gray");
        Sedan sedan1 = new Sedan("Mercedes","e220",2022,"White");
        Sedan sedan2 = new Sedan("Mercedes","e300",2023,"Silver");

        Bus bus = new Bus("Mercedes","Maraton",2021,"Black");
        Bus bus1 = new Bus("Mercedes","Maraton",2021,"Black");
        Bus bus2 = new Bus("Mercedes","Maraton",2021,"Black");
        Bus bus3 = new Bus("Mercedes","Maraton",2021,"Black");
        Bus bus4 = new Bus("Mercedes","Maraton",2021,"Black");


        otopark.addVehicle(sedan);
        otopark.addVehicle(sedan1);
        otopark.addVehicle(sedan2);
        otopark.addVehicle(bus);
        otopark.addVehicle(bus1);
        otopark.addVehicle(bus2);
        otopark.addVehicle(bus3);
        otopark.addVehicle(bus4);
        System.out.println();

        otopark.listOfVehicle();
        System.out.println();
        otopark.numberOfVehicleByType();
    }
}
