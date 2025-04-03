package day49_Interface_Enum_DataClass.Shape;

public class Rectangle extends ShapeAbstract implements Shape {

    private double length;
    private double width;

    public Rectangle(String name ,String color,double length, double width) {
        super(name,color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2* (length + width);
    }

    @Override
    public double area() {
        return length*width;
    }
    public void threeDPrinter(){
        System.out.println("Bende kullanılmıyor.");
    }
//    public void disPlayInfo(){
//        //Shape.super.disPlayInfo();
//        System.out.println("I am a rectangle");
//    }
}
