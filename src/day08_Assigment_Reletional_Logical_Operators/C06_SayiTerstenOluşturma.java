package day08_Assigment_Reletional_Logical_Operators;

public class C06_SayiTerstenOluşturma {
    public static void main(String[] args) {

        //ödev
        //verilen 3 basamaklı sayıyı tersten oluşturan kodu yazınız.
        // 123 --> 321

        int sayi = 123;
        int birler, onlar, yüzler;

        birler = sayi % 10;
        sayi /= 10;

        onlar = sayi % 10;
        sayi /= 10;

        yüzler = sayi % 10;
        sayi /= 10;



        int yeniYuzler, yenionlar, yeniBirler;

        yeniYuzler = birler * 100;
        yenionlar = onlar * 10;
        yeniBirler = yüzler * 1;
        System.out.print("Yeni sayı : ");
        System.out.println(yeniBirler + yenionlar + yeniYuzler);


    }
}
