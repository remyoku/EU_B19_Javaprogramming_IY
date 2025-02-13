package day22_ClassObject;

public class Main {
    public static void main(String[] args) {

        int i1 = 6;
        int i2 = 4;

        Calculator calculator = new Calculator(); //ben dedim ki diğer classtan alarak bana bir hesp makşnesi üret
        // bunu yapmamın sebebi de diğer clasta iki işlemim varya diğer şekil
        //çağırdığımda calculator. toplam çıkarma oluyor
        // diğer sayfada yazdık bu sayfada yazdıklarımızı main metodu ile run ettik.

        System.out.println(calculator.cıkart(i1, i2));
        System.out.println(calculator.topla(i1, i2));

        Calculator calculator1 = new Calculator(); //Bir main methodu içinde başka bir calculatorde oluşturabiliriz.
        System.out.println("calculator1.topla(34,21) = " + calculator1.topla(34, 21));


        System.out.println("------------------------------------------------------------------------------");

        Circle circle = new Circle();
        System.out.println("circle.r = " + circle.r);
        circle.r = 5;
        System.out.println("circle.r = " + circle.r);
        System.out.println("circle.pi = " + circle.pi);

        circle.alanHesapla();
        System.out.println("circle.cevreHesapla() = " + circle.cevreHesapla());

        Circle circle1 = new Circle();
        circle1.r = 3;
        circle1.alanHesapla();
        System.out.println(circle.cevreHesapla());

        System.out.println("------------------------------------------------------------------------------");

        Person irem = new Person();
        irem.isim = "İrem";
        irem.yas = 26;
        irem.cinsiyet = "Kadın";
        irem.tcNo = "43204033122";

        irem.uyu();
        System.out.println("irem.yas = " + irem.yas);
        System.out.println("irem.isim = " + irem.isim);
        System.out.println("irem.cinsiyet = " + irem.cinsiyet);
        System.out.println("irem.tcNo = " + irem.tcNo);
        irem.oyunOyna();

        Person eslem = new Person();
        eslem.isim = "Eslem";
        eslem.yas = 13;
        eslem.cinsiyet = "Kadın";
        eslem.tcNo = "36550497526";
        eslem.yılsonuOrtalama = 95;

        eslem.uyu();
        eslem.oyunOyna();

        System.out.println("------------------------------------------------------------------------------");

        Car car1 = new Car();
        car1.marka = "Volvo";
        car1.model = "Xc90";
        car1.renk = "Derin Mavi";
        car1.hız = 200.0;

        car1.calıstı();
        car1.hızlandı();
        car1.durdu();

        Car car2 = new Car();
        car2.marka = "Audi";
        car2.model = "Q3";
        car2.renk = "Siyah";
        car2.hız = 260.0;

        car2.calıstı();
        car2.hızlandı();
        car2.durdu();

        System.out.println(car1 == car2);

        car1 = car2;
        // car2.marka="Mercedes";
        System.out.println(car1.marka);

        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Math2.pow(2,5) = " + Math2.pow(2, 5));

        System.out.println("------------------------------------------------------------------------------");
        Math2 obj = new Math2();
        System.out.println("Math2.pow2(5,3) = " + Math2.pow2(5, 3));


    }
}
