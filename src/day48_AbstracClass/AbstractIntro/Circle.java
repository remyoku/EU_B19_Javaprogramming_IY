package day48_AbstracClass.AbstractIntro;

public class Circle extends Shape {



    private int radius;

    public Circle(String name) {
        super(name);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int perimeter() {
        return (int) (PI * 2 * radius);
    }

    @Override
    public int area() {
        return (int) (PI * radius * radius);
    }
}