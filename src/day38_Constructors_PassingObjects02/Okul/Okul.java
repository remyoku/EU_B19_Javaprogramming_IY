package day38_Constructors_PassingObjects02.Okul;

import java.util.ArrayList;

public class Okul {

    String name;
    Adres okulAdres;
    ArrayList<Ogrenci> ogrenciler;


    public Okul() {
        this.name = "Belirtilmemiş";
        this.okulAdres=new Adres();
        ogrenciler = new ArrayList<>();
    }

    public Okul(String name) {
        this();
        this.name = name;
    }

    public Okul(String name, Adres okulAdres) {
        this(name);
        this.okulAdres = okulAdres;
    }

    public Okul(String name, Adres okulAdres, ArrayList<Ogrenci> ogrenciler) {
        this.name = name;
        this.okulAdres = okulAdres;
        this.ogrenciler = ogrenciler;
    }
    public void ogrenciEkle(Ogrenci ogrenci){
        ogrenciler.add(ogrenci);
    }

    @Override
    public String toString() {
        return "Okul{" +
                "name='" + name + '\'' +
                ", okulAdres=" + okulAdres +
                ", ogrenciler=" + ogrenciler +
                '}';
    }

}
