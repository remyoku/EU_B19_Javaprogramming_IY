package day06_Arithmetic_UnaryOperators;

public class C07_ClassTask3 {
    public static void main(String[] args) {
        /*
        Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk
        vardır. Toplantıya 113 katılmıştır.

         */

        int sira = 15;
        int siraKoltukSayisi =12;
        int katilan= 113;

        //1.Toplantı salonun toplam kapasitesi nedir?

        int kapasite = sira*siraKoltukSayisi;
        System.out.println("kapasite = " + kapasite);

       //2.Kaç adet boş koltuk vardır?

        int boşKoltuk= kapasite-katilan;
        System.out.println("boşKoltuk = " + boşKoltuk);

        //3.Kaç adet sırada oturulmaktadır?

        int oturulanSiraAdedi = katilan/siraKoltukSayisi+1;
        System.out.println("oturulanSiraAdedi = " + oturulanSiraAdedi);

        //4.Kaç sıra tamamen boş kalmıştır?

        int bosSira= sira-oturulanSiraAdedi;
        System.out.println("bosSira = " + bosSira);

        //5. Oturulan sıralarda kaç adet boşluk var?

        int oturulanSiradakiBosKoltuk = siraKoltukSayisi - (katilan%12);
        System.out.println("oturulanSiradakiBosKoltuk = " + oturulanSiradakiBosKoltuk);

        int cevap2= boşKoltuk%12;
        System.out.println("cevap2 = " + cevap2);


    }
}
