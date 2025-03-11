package day39_Encapsulation01;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("  İrem   ");
        System.out.println("person.getName() = " + person.getName());

        Adress isAdresi = new Adress("ABC Plaza no : 123","Adana","Türkiye");
        System.out.println("isAdresi.toString() = " + isAdresi.toString());


        ArrayList<Adress> adresses = new ArrayList<>();
        adresses.add(new Adress("1.ABC Plaza no : 123","Adana","Türkiye"));
        adresses.add(new Adress("2.ABC Plaza no : 123","Adana","Türkiye"));

        person.setAdressler(adresses);
        System.out.println("person.toString() = " + person.toString());

        person.setSifre(1234);
        System.out.println("person.getSifre() = " + person.getSifre());
        System.out.println("person.getName() = " + person.getName());
    }
}
