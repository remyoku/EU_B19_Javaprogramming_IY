package day22_ClassObject;

public class Person {

    String isim;
    int yas;
    String cinsiyet;
    String tcNo;
    double yılsonuOrtalama;

    public void uyu(){
        System.out.println(isim + " uyuyor.");
    }
    public void oyunOyna(){
        System.out.println(isim + " Oyun oynuyor.");
    }
}
/*
     özellikleri (fields) yaş , ismi , cinsiyet , tcNo, yılsonuOrtalama
     aksiyonları (methodları) uyu(), oyunOyna(), gecmeNotu()
 */