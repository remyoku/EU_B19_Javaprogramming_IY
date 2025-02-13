package day23_Review;

public class MobilePhone {

    String marka;
    String model;
    String renk;
    double fiyat;
    double boyut;
    String kapasite;
    boolean mesajAtabiliyorMu;

    public void ara(){
        System.out.println(marka + " " + model + " " + renk + " telefon arama yapıyor.");
    }
    public void mesajAt(){

        System.out.println(marka + " " + model+ " telefon mesaj atabiliyor mu? :" + mesajAtabiliyorMu);


    }
    public void fotoğrafÇek(){
        System.out.println(marka + " " + model + " " + boyut +" "+ kapasite+ " telefon fotoğraf çekmede başarılı");
    }
    public void interneteBağlan(){
        System.out.println(marka + " " + model + " telefonun fiyatı:  " +fiyat+ " ve bu telefon internete bağlanıyor." );
    }
}
/*
marka
model
renk
fiyat
boyut
kapasite
mesajAtabiliyorMu


ara()
mesajAt()
fotoğrafÇek()
interneteBağlan()

 */