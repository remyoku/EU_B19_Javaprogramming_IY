package day23_Review;

public class Dog {

    // templeta --- blueprint --- taslak
    //burda atama neden yapmuyoruz çünkü biz decleration yapıyoruz.
    // bunlar köpeğe ait fieldslar özellikler
    String ad;
    String cins;
    String renk;
    int yas;
    char cinsiyet;
    boolean evcilMi;

    // biz actions method da yazarız ki main methodda çağıralım

    public void havla(){
        System.out.println(ad + " havlıyor...");
    }

    public void ısır(){
        System.out.println(ad + " ısırıyor...");
    }

    public void mamaYe(){
        System.out.println(ad + " mama yiyor...");
    }

    public void suruGit(){
        System.out.println(ad + " sürü ile git...");
    }
}
