package day49_Interface_Enum_DataClass.AnimalClass;

public interface Flyable {
    void fly();

    static void staticMethod(){
        System.out.println("Flyable static method");
    }
    private static void staticMethodPrivate(){
        System.out.println("Flyable static private method");
    }

    private  void methodPrivate(){
        System.out.println("Flyable private method");
    }

    default void  defaultMethod(){
        System.out.println("Flyable default");
    }
}

