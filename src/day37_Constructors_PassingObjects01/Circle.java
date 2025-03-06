package day37_Constructors_PassingObjects01;

public class Circle {

    //Attribute /Properties -Fields-Data-member-State
    double radius; //instance variable -- objecte ait
    double height;

    /**
     * CONSTRUCTOR
     * İnşa eden projeyi gerçek bir nesneye dönüştüren
     * Bir classdan obje oluşturmka için başvurmamız gereken methoddur.
     * Otomatik olarak çağrılır.
     * cONSTRUCTORLARIN AMACI : Classlardan oluşturulacak objelerin
     * data field , attribute variable
     * alanlarına başlangıç değerlerini atamaktır.
     * <p>
     * İsmi class ismi ile aynı olmak zorundadır. Return type yoktur void dahil.
     */
    public Circle() {
        System.out.println("No args/Default constructor called");
        radius = 0;
        height = 0;
    }


    public Circle(double yarıçap) {
        System.out.println("Parameterized Constructor called");
        radius = yarıçap;
    }

    public Circle(double yariCap, double yukseklik) {
        System.out.println("Parameterized Constructor called");
        radius = yariCap;
        height = yukseklik;
    }

    public double getArea() {
        // return radius*radius*Math.PI;
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double yükseklik) {
        height = yükseklik;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        // return 2 * radius * Math.PI*height;
        return getPerimeter() * height;
    }

    public String showInfo(){
        String str ="";
        str+="Dairenin yarıçapı        :"+radius + "\n";
        str+="Dairenin yüksekliği      :"+height + "\n";
        str+="------------------------------------------"+ "\n";
        str+="Dairenin alanı           :"+getArea() + "\n";
        str+="Dairenin çevresi         :"+getPerimeter() + "\n";
        str+="Dairenin hacmi           :"+getVolume() + "\n";

        return str;
    }


    public static void main(String[] args) {

        Circle daire1 = new Circle(); // default constructor - No args/params const.
        System.out.println(daire1.radius);//0.0

        daire1.radius = 12;
        System.out.println("daire1.radius = " + daire1.radius);//12.0

        Circle daire2 = new Circle(15);
        System.out.println("daire2.radius = " + daire2.radius);//15.0

        System.out.println("daire1.getArea() = " + daire1.getArea());
        System.out.println("daire2.getArea() = " + daire2.getArea());
        System.out.println("daire1.GetPerimeter() = " + daire1.getPerimeter());

        daire1.radius = 125;
        System.out.println("daire1.getPerimeter() = " + daire1.getPerimeter());

        daire2.radius = 100;
        System.out.println("daire2.radius = " + daire2.radius);//100.0
        System.out.println("daire2.getPerimeter() = " + daire2.getPerimeter());
        System.out.println("daire2.getArea() = " + daire2.getArea());

        daire2.setRadius(25);
        System.out.println("daire2.radius = " + daire2.radius);//25.0
        //biir method yaptık ve method içinden radiusu değiştirdik.

        System.out.println("daire2.getArea() = " + daire2.getArea());

        System.out.println("daire2.getRadius() = " + daire2.getRadius());//25.0

        System.out.println();

        Circle daire3 = new Circle(2, 3);
        System.out.println("daire3.getRadius() = " + daire3.getRadius());//2.0
        System.out.println("daire3.getHeight() = " + daire3.getHeight());//3.0
        System.out.println("daire3.getArea() = " + daire3.getArea());
        System.out.println("daire3.getPerimeter() = " + daire3.getPerimeter());
        System.out.println("daire3.getVolume() = " + daire3.getVolume());


        System.out.println("daire3.showInfo() = " + daire3.showInfo());
        System.out.println("daire1.showInfo() = " + daire1.showInfo());
        System.out.println("daire2.showInfo() = " + daire2.showInfo());

    }
}



