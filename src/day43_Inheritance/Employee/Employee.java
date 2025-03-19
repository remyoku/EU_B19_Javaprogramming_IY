package day43_Inheritance.Employee;

public class Employee {
    String name;
    int employeeId;

    double salary;

    int workHours;

    int vacationDay;

    char gender;

    String campusName = "Yenişehir Kampüsü";


    public void raiseSalary(){
        System.out.println( "% 25 oranında maaş zammı talebi var.");
    }
    public void leaveHoliday(int day){
        System.out.println(this.name +"'in " + day + " günlük izin talebi var.");
    }
    public void resign(){
        System.out.println("İşten affını istedi.");
    }
}
