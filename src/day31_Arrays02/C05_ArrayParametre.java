package day31_Arrays02;

public class C05_ArrayParametre {
    public static void main(String[] args) {
        String[] cars = {"Honda", "Toyota", "Opel", "Mercedes", "Audi"};

        printArray(cars);
        printArray2(cars);
    }

    public static void printArray(String[] cars) {
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public static void printArray2(Object[] cars) {  //method Overloading  same class -- same name -- different parametre
        for (Object car : cars) {
            System.out.println(car);
        }
    }
}