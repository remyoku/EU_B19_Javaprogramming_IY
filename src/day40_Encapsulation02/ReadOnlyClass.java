package day40_Encapsulation02;

import java.util.ArrayList;

public class ReadOnlyClass {
    //Instance variables -- objeye ait.
    private int plaka;
    private String ilAdi;


    private static ArrayList<String> iller = new ArrayList<>();

    public ReadOnlyClass(int plaka, String ilAdi) {
        /*this.plaka = plaka;
        this.ilAdi = ilAdi;
        */
        setPlaka(plaka);
        setIlAdi(ilAdi);
        setIl();
    }

    public int getPlaka() {
        return plaka;
    }

    private void setPlaka(int plaka) {                  //biz setleri private yaptık çünkü sadece okunsun istiyoruz
        if (plaka > 0 && plaka <= 81) {
            this.plaka = plaka;
        }

    }

    public String getIlAdi() {
        return ilAdi;
    }

    private void setIlAdi(String ilAdi) {
        this.ilAdi = ilAdi.toUpperCase();
    }

    public void setIl() {
        String str = plaka + " - " + ilAdi;
        iller.add(str);
    }

    public ArrayList<String> getIller() {
        return iller;
    }

    public ArrayList<String> getIllerV1() {
        return new ArrayList<>(iller);
        // bunu yapmam lazım çünkü yukarıdakini yaparsam
        // datama hala ekleme yapabilirim bu da açık var demek olur.
    }
}