package day44_Inheritance_02.PersonProject;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();
        person.introduce();
        person.commonTask();


        Student student = new Student();
        student.introduce(); // method overriding / specific implementation dor child class
        student.commonTask(); // method inherited from parent class
        student.study(); // study method in child class

    }
}
