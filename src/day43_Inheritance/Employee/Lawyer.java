package day43_Inheritance.Employee;

public class Lawyer extends Employee{

    String caseName;
    String caseStatus;


    public void joinCourt(){
        System.out.println("Avukat duruşmaya katıldı");
    }
    public void submitClaim(){
        System.out.println("Avukat davayı kazandı.");
    }
    public void raiseSalary(){
        System.out.println( "% 55 oranında maaş zammı talebi var.");
    }
}
