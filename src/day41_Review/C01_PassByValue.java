package day41_Review;

import java.util.Arrays;

public class C01_PassByValue {
    public static void main(String[] args) {


        //primitive
        double fiyat = 200; //buna birindirim uygulama methodu yazıcaz
        System.out.println("fiyat = " + fiyat);
        indirim10(fiyat);
        System.out.println("fiyat = " + fiyat);
        //biz methoda değeri yolladık methodda değişiklik yapıldı
        // ama değer mainde  muhafaza edildi işte buna -- pass by value denir.
        //immutable --- değiştirilemez.
        indirim10_2(fiyat);
        System.out.println("fiyat = " + fiyat);
        //method uygulanması orjinal değeri değiştirmez.

        //string
        String word = "İrem";
        addStar(word);
        System.out.println("word = " + word);

        //arraylar
        int [] sayilar = {1,5,7};

        System.out.println("Arrays.toString(sayilar)- Methoddan önce = " + Arrays.toString(sayilar));
        onEkle(sayilar);
        System.out.println("Arrays.toString(sayilar)- Methoddan sonra = " + Arrays.toString(sayilar));
        //arraylar ve arraylist gibi yapılar bir methodun içine gönderilip kullanılınca değişime uğruyor.(mutable)
        //eğer değişmesin istiyorsam main methoddaki aşşağıda yazdığım methoda farklı bir şeye aktarmadığım sürece
        //  mesela int clone oluşturup maindekini koruruz.

        StringBuilder sb = new StringBuilder("Hasan");
        sb.reverse();    // atamadan direkt olarak yazdırabiliyoruz. normalde sb = sb.reverse(); böyle yapıyorduk.
        System.out.println("sb = " + sb);


    }
    public static void indirim10(double fiyat){
        fiyat = fiyat*0.9;
        System.out.println("Method içi fiyat = " + fiyat);
    }
    public static double indirim10_2(double fiyat) {
        fiyat = fiyat * 0.9;
        System.out.println("Method içi fiyat = " + fiyat);
        return fiyat;
    }
    public static String addStar(String word){
        word = "***" + word + "***";
        System.out.println("Method içi word = " + word);
        return word;
    }
    public static int[] onEkle(int [] sayilar){
        int [] sayilar2 = sayilar.clone();
        for (int i = 0; i < sayilar2.length; i++) {
            sayilar2[i] +=10;
        }
        System.out.println("Arrays.toString(sayilar)- Method içi = " + Arrays.toString(sayilar2));
        return sayilar2;
    }
}
