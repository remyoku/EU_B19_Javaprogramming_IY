package day48_AbstracClass.AbstractIntro;

public class Rectangle extends  Shape{

    private int width;
    private int length;

    public Rectangle(String name) {
        super(name);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int perimeter() {
        return (length+width)*2;
    }

    @Override
    public int area() {
        return length*width;
    }
}
