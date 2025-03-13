package day41_Review.encapsulation;

public class C02_EmployeeTest {
    public static void main(String[] args) {

        C01_Employee employee = new C01_Employee();

        employee.setFirstName("Sezen");
        employee.setLastName("Aksu");

        employee.setAge(35);
        employee.setPhoneNumber("5362588969");

        System.out.println("employee = " + employee);

        C01_Employee employee1 = new C01_Employee("123","14",-9,"telefon");
        System.out.println("employee1 = " + employee1);

        C01_Employee employee2 = new C01_Employee("Irem","Yokus",26,"5077989514");
        System.out.println("employee2 = " + employee2);
    }
}
