package day41_Review.encapsulation;

import java.util.regex.Pattern;

public class C01_Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z]+$");

    public String getFirstName() {
        return firstName;
    }

    public C01_Employee() {
    }

    public C01_Employee(String firstName, String lastName, int age, String phoneNumber) {
        /*this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;*/
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPhoneNumber(phoneNumber);
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if (firstName.length()>= 3 && firstName.length()<=20 && NAME_PATTERN.matcher(firstName).matches()){
            this.firstName = firstName;
        }else {
            System.out.println("Geçersiz İsim.. Ya uzun/kısa isim girdiniz ya da rakam/özel karakter girdiniz.");
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName.trim();
        if (lastName.length()>= 3 && lastName.length()<=20 && NAME_PATTERN.matcher(lastName).matches()){
            this.lastName = lastName;
        }else {
            System.out.println("Geçersiz Soyİsim.. Ya uzun/kısa isim girdiniz ya da rakam/özel karakter girdiniz.");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age> 0 && age<100){
            this.age = age;
        }else {
            System.out.println("Hatalı yaş bilgisi");
        }

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^[1-9][0-9]{9}$")){
            this.phoneNumber = phoneNumber;
        }else {
            System.out.println("Geçersiz Tel No");
        }

    }

    @Override
    public String toString() {
        return "C01_Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
