package day41_Review.encapsulation;

public class C04_ImmutablePersonTest {
    public static void main(String[] args) {

        C03_ImmutablePerson person = new C03_ImmutablePerson("Eslem",13);

        System.out.println("person.getAge() = " + person.getAge());
        System.out.println("person.getName() = " + person.getName());

        person.changeAge(2);
        System.out.println("person.getAge() = " + person.getAge());

        person.changeName("Irem");
        System.out.println("person.getName() = " + person.getName());

    }
}
