package day38_Constructors_PassingObjects02;

public class Student {
    String name;
    String adress;
    int age;
    long id;


    public Student() {
        System.out.println("Default constructor");
        this.name = "Belirtilmemiş";
        this.adress = "Belirtilmemiş";
        this.age = 0;
        this.id = 1000;
    }

    public Student(String name) {
        this(); // boş parametresiz constuctoru böyle çağırırız.
        System.out.println("Constructor with only name field.");
        this.name = name;
    }

    public Student(int age) {
        this("İrem"); // constuctor içinde constructor yapacaksak başına koymamız lazım.
        System.out.println("Constructor with only age field.");
        this.age = age;
    }

    public Student(long id) {
        this(18);
        System.out.println("Constructor with only age field.");
        this.id = id;
    }
}