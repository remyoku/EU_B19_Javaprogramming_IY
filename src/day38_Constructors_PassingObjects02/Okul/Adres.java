package day38_Constructors_PassingObjects02.Okul;

public class Adres {

    String cadde ;
    String ilce;
    String sehir;
    int no;

    public Adres(){
        System.out.println("No params");
        cadde = "Belirtilememiş";
        ilce = "Belirtilmemiş";
        sehir = "Belirtilmemiş";
        no = 0;
    }
    public Adres(String sehir){
        /*
        cadde = "Belirtilmemiş";
        ilce = "Belirtilmemiş";
        no = 0;*/
        this();// constuctor chaining -- bir constructor içinde başka bir contr. çağrılmasıdır.
        System.out.println("Şehir parametreli");
        this.sehir = sehir;
    }

    public Adres(String ilce, String sehir) {
        this(sehir);
        System.out.println("2 parametreli");
        this.ilce = ilce;
        //this.sehir = sehir;
    }

    public Adres(String cadde, String ilce, String sehir, int no) {
        this.cadde = cadde;
        this.ilce = ilce;
        this.sehir = sehir;
        this.no = no;
    }

    public String toString(){
        return "Adres{" +
                "cadde = "+ cadde +
                " ,ilçe = " + ilce +
                " ,Şehir = " + sehir +
                " ,no = " + no +
                "}";
    }
}
