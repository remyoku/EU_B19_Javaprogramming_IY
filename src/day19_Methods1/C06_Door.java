package day19_Methods1;

public class C06_Door {
    public static void main(String[] args) {

        System.out.println("START!!");
        openDoor();
        enterInside();
        closeDoor();
        System.out.println("FINISH!!");

        System.out.println("START!!");
        openDoor();
        closeDoor();
        System.out.println("FINISH!!");
    }


    public static void openDoor(){
        System.out.println("I open the door.");
    }
    public static void enterInside(){
        System.out.println("I enter inside home.");
    }
    public static void closeDoor(){
        System.out.println("I close the door.");
    }
}
