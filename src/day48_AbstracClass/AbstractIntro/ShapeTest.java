package day48_AbstracClass.AbstractIntro;

public class ShapeTest {
    public static void main(String[] args) {

        // Shape shape = new Shape("Circle");
       // System.out.println("shape.getName() = " + shape.getName());

        Circle circle = new Circle("Eşkenar");
        System.out.println("circle.getName() = " + circle.getName());

        Rectangle rectangle = new Rectangle("Rectangle");
        rectangle.setLength(4);
        rectangle.setWidth(5);
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());
        System.out.println("rectangle.area() = " + rectangle.area());


    }
}
