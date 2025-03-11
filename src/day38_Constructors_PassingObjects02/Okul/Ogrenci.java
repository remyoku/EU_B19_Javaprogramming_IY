package day38_Constructors_PassingObjects02.Okul;

public class Ogrenci {
    String name;
    String sinif ;
    int age ;
    Adres evAdresi;
    Adres okulAdresi;

    public Ogrenci() {
        this.name = "Belirtilmemiş";
        this.sinif = "Belirtilmemiş";
        this.age =0;
        this.evAdresi = new Adres();
        this.okulAdresi = new Adres();
    }

    public Ogrenci(String name) {
        this();
        this.name = name;
    }

    public Ogrenci(String name, String sinif, int age) {
        this(name);
        this.sinif = sinif;
        this.age = age;
    }

    public Ogrenci(String name, String sinif, int age, Adres evAdresi, Adres okulAdresi) {
        this.name = name;
        this.sinif = sinif;
        this.age = age;
        this.evAdresi = evAdresi;
        this.okulAdresi = okulAdresi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", sinif='" + sinif + '\'' +
                ", age=" + age +
                ", evAdresi=" + evAdresi +
                ", okulAdresi=" + okulAdresi +
                '}';
    }
}
