package day41_Review.constructors;

public class C01_Student {

    String name;
    String lastName;

    int number;
    char gender;
    boolean isDorm;


    public  C01_Student(){
        System.out.println("Kayıt Alındı");

    }
    public  C01_Student(int number){
        this.number=number;
        System.out.println("Kayıt Alındı");

    }

    public C01_Student(String name, String lastName,  boolean isDorm) {
        this();
        this.name = name;
        this.lastName = lastName;
                                      //this koymamızın sebebi yukarıdaki fieldlar ile methoddaki isimler aynı
        this.isDorm = isDorm;        // bunlar karışmasın diye yapıyoruz.
    }

    public C01_Student(String name, String lastName, int number, char gender) {
        this(number);
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "C01_Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", gender=" + gender +
                ", isDorm=" + isDorm +
                '}';
    }
}
