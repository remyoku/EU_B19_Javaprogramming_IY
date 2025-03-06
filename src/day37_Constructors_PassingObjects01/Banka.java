package day37_Constructors_PassingObjects01;

import java.util.ArrayList;

public class Banka {

    String name;
    String adress;
    int hesapNo;

    ArrayList<Musteri> musteriler;


    public Banka() {
        name = "İsimsiz Banka";
        adress = "Adres bilgisi yok";
        hesapNo = 1000;

        musteriler = new ArrayList<>();
    }

    public Banka(String name, String adress, int hesapNo) {
        this.name = name;
        this.adress = adress;
        this.hesapNo = hesapNo;
        musteriler = new ArrayList<>();
        //parametreden geleni objeye ait olana ata derken this kullanıyoruz
        // yoksa name = name dersek main methodda nul alırız ama
        // this ile atadığımıza erişiriz
    }

    public void musteriEkle(Musteri musteri) {
        hesapNo++;
        musteri.hesapNo = hesapNo;
        musteriler.add(musteri);
        System.out.println(musteri.name + " isimli müşteri için " + musteri.hesapNo + " nolu hesap numarası açılmıştır");


    }

    public void paraYatir(Musteri musteri, double miktar) {
        if (miktar > 0) {
            musteri.bakiye += miktar;
        }
    }
    public void paraCek(Musteri musteri, double miktar){
        if (miktar >0 && musteri.bakiye >= miktar){
            musteri.bakiye -= miktar;
        }else {
            System.out.println("Hesabınızda yeterli bakiye yok.");
            System.out.println("En Fazla " + musteri.bakiye+ " TL miktarında para çekebilirsiniz.");
        }
    }

    public void müşteriListe() {
        for (Musteri musteri : musteriler) {
            musteri.showInfo();
            System.out.println("-------------------------");
        }
    }
}
