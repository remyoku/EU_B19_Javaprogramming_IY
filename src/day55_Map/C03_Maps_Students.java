package day55_Map;

import java.util.Map;
import java.util.TreeMap;

public class C03_Maps_Students {
    public static void main(String[] args) {

        //Map ->
        // Keys : Integer,String
        //Values : String , Integer, Double...
        //Values: Array , Class Object,List,Map
        Map<Integer,Student> studentList = new TreeMap<>();

        Student st1 = new Student(5,"İrem",3.5,"Java");
        Student st2 = new Student(3,"Süleyman",2.5,"Cyber");
        Student st3 = new Student(7,"Selda",2.0,"Playwright");
        Student st4 = new Student(10,"Alper",1.5,"AWS");
        Student st5 = new Student(4,"Tülay",3.9,"Jenkins");
        Student st6 = new Student(6,"Yasemin",3.1,"Github");

        studentList.put(st1.getStudentId(), st1);
        studentList.put(st2.getStudentId(), st2);
        studentList.put(st3.getStudentId(), st3);
        studentList.put(st4.getStudentId(), st4);
        studentList.put(st5.getStudentId(), st5);
        studentList.put(st6.getStudentId(), st6);

        System.out.println("studentList = " + studentList);

        //key kullanarak value çağırıyoruz.
        System.out.println("studentList.get(5) = " + studentList.get(5));

        //key kullanarak object value deki değerleri çağırır.
        System.out.println("studentList.get(10).getName() = " + studentList.get(10).getName());

        //farklı key e aynı value ataması
        studentList.put(11,st1);
        System.out.println("studentList = " + studentList);
        //var olan key e farklı bir value ataması
        //key daha önec tanımlandı ise aynı key in karşılığını olan value, yeni value ile replace oluyor,update oluyor.
        studentList.put(11,st2);
        System.out.println("studentList = " + studentList);


    }

}
class Student{
    private int studentId;
    private String name;
    private double grade;
    private String className;

    public Student(int studentId, String name, double grade, String className) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.className = className;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", className='" + className + '\'' +
                '}';
    }
}
