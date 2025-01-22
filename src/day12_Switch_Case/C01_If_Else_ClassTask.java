package day12_Switch_Case;

import java.util.Scanner;

public class C01_If_Else_ClassTask {
    public static void main(String[] args) {

      /*
    Verilen bir sayı eğer 3 e bölünüyorsa cizz yazsın
    eğer 5 e bölünüyorsa bizz yazsın
    eğer hem 3 e hem 5 e bölünüyorsa cizzbizz yazsın
    eğer 3 e ve 5 e bölünmüyorsa "Bölünmez" yazsın.
    */

        Scanner sayiGir = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int girilenSayi = sayiGir.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0){
            System.out.println("cizzbizz");
        } else if (girilenSayi % 3 ==0) {
            System.out.println("cizz");

        } else if (girilenSayi % 5 == 0) {
            System.out.println("bizz");

        }else {
            System.out.println("Bölünmez");
        }




        //Soru 2- Kullanicidan aldigi urun adedi ve urun fiyatini alin,
// kullaniciya musteri karti olup olmadigini sorun.
// Musteri karti varsa
// 10 urun veya fazla alirsa %20,
// 10 urunden az alirsa %15 indirim yapin,
// Musteri karti yoksa
// 10 urun veya fazla alirsa %15,
// 10 urunden az %10 indirim yapin
/*
Kullanicidan artik yil olup olmadigini kontrol
etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil
degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen
yillar artik yildir
Kural 3: 4’un kati olmasina ragmen 100 ile
bolunebilen yillardan sadece
400’un kati olan yillar artik yildir

*/

    }
}
