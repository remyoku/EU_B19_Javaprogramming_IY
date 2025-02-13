package day22_ClassObject;

public class Car {

    String marka;
    String model;
    String renk;
    double hız;

    public void calıstı(){
        System.out.println(marka +" "+  model +" "+  renk +  " araba çalıştı.");
    }

    public void hızlandı(){
        System.out.println(marka + " araba" +" "+ hız + " km hızla hızlandı.");
    }
    public void durdu(){
        System.out.println(marka +" "+  model+ " " + renk +  " araba durdu.");
    }
}
/*
     Fields marka, model, renk, hiz
     Methods calistir, hizlan, dur
     Javada Car class oluşturun?
 */
