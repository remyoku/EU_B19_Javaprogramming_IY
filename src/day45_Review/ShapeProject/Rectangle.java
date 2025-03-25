package day45_Review.ShapeProject;

public class Rectangle extends Shape{

    double lenght;
    double width;

    public Rectangle(String color , double lenght, double width){
        super(color);
        this.lenght=lenght;
        this.width=width;
        System.out.println("Inside Rectangle constructor with color " + this.color+ "lenght : " + this.lenght+ ", width : " + this.width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public double calculateArea() {
        return this.lenght*this.width;
    }
    public void displayInfo(){
        System.out.println("Color : " + super.color +"Lenght : "+ this.lenght + " , Width : " + this.width);
    }
}
