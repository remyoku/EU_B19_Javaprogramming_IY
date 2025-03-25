package day43_Inheritance.Employee;

public class Developer extends Employee {
    /**
     * Miras
     * is-a ilişkisi
     * hem fieldları hemde methotları inheritance yoluyla kullanabileceğim
     * super - sub
     * parent-child
     * base-derived
     *
     * extends ile baba ve cocuklar arasında is a relationship bağı kurulur.
     *
     * kodun tekrarını engellemek ve kod tekrarından kurtulmak amacı
     * bulunduğu konuma göre erişim imkanı sağlıyor.
     * kardeşler arasında bir erişim yok
     * sadece parentta erişim var.
     *
     * priveta a erişim yok parentta olsa bile
     *
     * developer - is a - employee
     * bir child classın iki tane parent classı olamaz.
     */

    String projectName;

    String mainLang;

    String campusName = "Etlik Kampüsü";


    public void releaseCode(){
        System.out.println("Kod canlıya sunuldu");
    }
    public void assignVM(){
        System.out.println("VM olarak görevlendirildi");
    }
}
