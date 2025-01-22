package day10_IfStatements;

import java.util.Scanner;

public class C04_ClassTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz : ");
        double fizik = input.nextDouble();

        System.out.println("Kimya notunuzu giriniz : ");
        double kimya = input.nextDouble();

        System.out.println("Matematik notunuzu giriniz : ");
        double matematik = input.nextDouble();

        System.out.println("Geçme notunuzu giriniz : ");
        double geçmeNotu = input.nextDouble();

        double ortalama = (fizik + kimya + matematik)/3;
        System.out.println("ortalama = " + ortalama);

        if (ortalama >= geçmeNotu){
            System.out.println("Geçtin Tebrikler.");
        }else{
            System.out.println("Ders Tekrarı Gerekmektedir.");
        }
        System.out.println("Program Bitti");


    }
}
 /*
fizik, kimya, matematik ve geçme notlarını konsoldan alın
ortalamayı hessaplayın
geçti ise "Tebrikler geçtiniz"
kaldi ise "Ders tekrarı gerekmektedir."
*/