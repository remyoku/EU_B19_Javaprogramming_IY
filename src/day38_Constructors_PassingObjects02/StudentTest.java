package day38_Constructors_PassingObjects02;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Eslem";
        student.age = 13;
        student.id=123456789;


        System.out.println("student.name = " + student.name);
        System.out.println();

        Student student1 = new Student("Eslem");
        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.id = " + student1.id);
        System.out.println("student1.adress = " + student1.adress);

        System.out.println();


        Student student2 = new Student(123456L);
        System.out.println("student2.id = " + student2.id);
        System.out.println("student2.age = " + student2.age);
        System.out.println("student2.name = " + student2.name);
        System.out.println("student2.adress= " + student2.adress);


    }
}
