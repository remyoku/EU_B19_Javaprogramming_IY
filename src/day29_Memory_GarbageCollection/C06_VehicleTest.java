package day29_Memory_GarbageCollection;

public class C06_VehicleTest {
    public static void main(String[] args) {

       //          STACK      HEAP
        C05_Vehicle car1 = new C05_Vehicle();
        car1.brandname = "Volvo";
        car1.model="XC 60";
        car1.year= 2024;


        System.out.println("car1 = " + car1); // referansını yazdırcak
        System.out.println("car1.brandname = " + car1.brandname);

        car1=null; // bunu yaparsak car1 artık boşa düşer adresi null olur.

        System.out.println("car1 = " + car1);

        System.out.println("car1.brandname = " + car1.brandname); // car1 null NullPointerException
                                                                // Cannot read  field "brandname" because "car1" is null



        for (int i = 0; i < 1000000; i++) {
            C05_Vehicle vehicle = new C05_Vehicle();
            System.out.println("vehicle = " + vehicle);
        }
        System.gc();//garbage collection çalışmasını istiyoruz.

    }
}
