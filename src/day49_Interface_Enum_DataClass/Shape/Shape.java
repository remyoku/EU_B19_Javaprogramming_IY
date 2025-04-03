package day49_Interface_Enum_DataClass.Shape;

public interface Shape {
    // ınterface içindeki propertiler(variable , fields, data members) default olarak public, static final olurlar.
    double PI = 3.14;

    public abstract double  perimeter();
    double area();

   default void threeDPrinter(){
       System.out.println("Üç boyutlu classlar içindir.");
   }

    default void disPlayInfo(){
        System.out.println("I am shape interface");
    }

    static void staticMethod(){
        System.out.println("I am a static method from Shape interface");
    }
}
