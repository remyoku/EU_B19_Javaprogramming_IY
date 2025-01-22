package day08_Assigment_Reletional_Logical_Operators;

public class C04_BasamaklaraAyirma {
    public static void main(String[] args) {

        // Verilen dört basamaklı bir sayıyı basamaklarına ayırarak yazdıran kod nedir?

        int sayi= 2395;
        int birler,onlar,yüzler,binler;

        birler = sayi % 10; //5
        sayi /= 10; // 239

        onlar = sayi % 10; //9
        sayi /= 10; //23

        yüzler = sayi % 10; //3
        sayi /= 10; //2

        binler = sayi % 10;

        System.out.println("sayi = " + sayi);
        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yüzler = " + yüzler);
        System.out.println("binler = " + binler);

    }
}
