package day23_Review;

public class Main {
    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone();

        phone.marka="Apple";
        phone.model="15 PRO";
        phone.renk="Naturel Titanyum";
        phone.boyut=6.12;
        phone.fiyat=88499;
        phone.kapasite="256 GB";
        phone.mesajAtabiliyorMu=true;

        phone.ara();
        phone.mesajAt();
        phone.fotoğrafÇek();
        phone.interneteBağlan();

        System.out.println("-------------------------------------------------");

        Cake cake1 = new Cake();
        cake1.kekeYapan="İrem";
        cake1.yumurtalıMı=false;
        cake1.ağırlık=1;

        Cake cake2 = new Cake();
        cake2.kekeYapan="Eslem";
        cake2.yumurtalıMı=true;
        cake2.ağırlık=2;

        cake1.kekYe();
        cake1.kekYe();
        System.out.println("cake1.dilim = " + cake1.dilim);


        cake2.kekYe();
        cake2.kekYe();
        cake2.kekYe();
        cake2.kekYe();
        System.out.println("cake2.dilim = " + cake2.dilim);

        System.out.println("Cake.kekDilimi = " + Cake.kekDilimi);
    }




}
