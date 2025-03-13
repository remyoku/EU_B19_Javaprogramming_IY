package day41_Review.encapsulation;

public class C06_WriteOnlyPersonTest {
    public static void main(String[] args) {

        C05_WriteOnlyPerson person = new C05_WriteOnlyPerson();

        person.setAge(25);
        person.setName("Ali");

        System.out.println("person.toString() = " + person.toString());
    }
}