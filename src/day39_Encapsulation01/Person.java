package day39_Encapsulation01;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private int sifre;

    private Adress evAdresi;
    private Adress isAdresi;
    private Adress okulAdresi;

    private ArrayList<Adress> adressler;

    //bunları encapsule edebilmem için private yapmak lazım.
    //bunlar bizim özel datalarımız.


    public Person() {
    }

    public Person(String name, int age, Adress evAdresi, Adress isAdresi, Adress okulAdresi, ArrayList<Adress> adressler) {
       // this.name = name;
        setName(name);
       // this.age = age;
        setAge(age);
       // this.evAdresi = evAdresi;
        setEvAdresi(evAdresi);
       // this.isAdresi = isAdresi;
        setIsAdresi(isAdresi);
       // this.okulAdresi = okulAdresi;
        setOkulAdresi(okulAdresi);
       // this.adressler = adressler;
        setAdressler(adressler);
    }

    public String getName() {
        Scanner scanner = new Scanner(System.in);


        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.println("Lütfen Şifre Giriniz:");
            int sifre = scanner.nextInt();
            if (sifre == this.sifre) {
                return name;
            }


        }
        return "Yanlış şifre girdiniz.3 defa giriş hakkınız dolmuştur.Kart Şifresi Bloke!!";

    }

    public void setName(String name) {
        name=name.trim();

        if (name.length()>=3 && name.length()<30){
            this.name = name;
        }else {
            System.out.println("Kurallara uygun bir isim girmediniz");
            this.name="isimsiz";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <120){
            this.age = age;
        }

    }

    public Adress getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(Adress evAdresi) {
        this.evAdresi = evAdresi;
    }

    public Adress getIsAdresi() {
        return isAdresi;
    }

    public void setIsAdresi(Adress isAdresi) {
        this.isAdresi = isAdresi;
    }

    public Adress getOkulAdresi() {
        return okulAdresi;
    }

    public void setOkulAdresi(Adress okulAdresi) {
        this.okulAdresi = okulAdresi;
    }

    public ArrayList<Adress> getAdressler() {
        return adressler;
    }

    public void setAdressler(ArrayList<Adress> adressler) {
        this.adressler = adressler;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", evAdresi=" + evAdresi +
                ", isAdresi=" + isAdresi +
                ", okulAdresi=" + okulAdresi +
                ", adressler=" + adressler +
                '}';
    }
}
