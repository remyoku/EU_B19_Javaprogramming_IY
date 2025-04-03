package day49_Interface_Enum_DataClass.DataClass;

public class C02_PersonTest {
    public static void main(String[] args) {

        C01_Person person = new C01_Person("İrem","Yokuş","5077989514");

        System.out.println("person.getFirstName() = " + person.getFirstName());
       // person.firstName = "Zhid"

        System.out.println(person);

        C03_PersonRecord personRecord = new C03_PersonRecord("Eslem","Yokuş","456789123","ABC sokak");
        System.out.println("personRecord.firstName() = " + personRecord.firstName());
        System.out.println(personRecord);
        personRecord.printAddress();

        System.out.println("personRecord.generateCode() = " + personRecord.generateCode());
    }
}
