package day42_StaticMembers;

public class C05_StudentTest {
    public static void main(String[] args) {

        C04_Student student1 = new C04_Student("İrem");
        C04_Student student2 = new C04_Student("Eslem",15);
        C04_Student student3 = new C04_Student("İkbal");
        C04_Student student4 = new C04_Student("Ömer",15);
        C04_Student student5 = new C04_Student("Hacer");
        C04_Student student6 = new C04_Student("Harun",15);

        System.out.println("student1.schoolName = " + student1.schoolName);

        System.out.println("student6 = " + student6);
        System.out.println("student3 = " + student3);

        System.out.println("C04_Student.counter = " + C04_Student.counter);

        System.out.println("student4 = " + student4);
        System.out.println("student5 = " + student5);


    }
}
