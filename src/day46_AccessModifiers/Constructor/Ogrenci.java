package day46_AccessModifiers.Constructor;

public class Ogrenci {

    private String name;
    private String lastName;
    private int number;


    public Ogrenci() {
        System.out.println("Private constructor called.");
    }

    protected Ogrenci(String name, String lastName) {
        this();
        this.name = name;
        this.lastName = lastName;
    }

    public Ogrenci(String name, String lastName, int number) {
        // this(name,lastName)
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
