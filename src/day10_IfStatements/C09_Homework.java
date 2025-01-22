package day10_IfStatements;

import java.util.Scanner;

public class C09_Homework {
    public static void main(String[] args) {
          /*
        task
2 adet vize notu alin
bir adet final notu alın
vizeler ortalamaya %20 etki ediyor
final ise %60 etki ediyor
ortalamayı hesaplayın
geçme notunu yazdırın

90 ve üzeri A
80 ve üzeri B
70 ve üzeri C
60 ve üzeri D
60 altı F
         */

        Scanner input = new Scanner(System.in);
        System.out.println("1.Vize notunuzu giriniz: ");
        double vize1 = input.nextDouble();
        System.out.println("2.Vize notunuzu giriniz: ");
        double vize2 = input.nextDouble();
        System.out.println("Final notunuzu giriniz: ");
        double finalNotu = input.nextDouble();
        double geçmeNotu = 60.0;
        System.out.println("Geçme Notu : " + geçmeNotu);

        double ortalama = vize1*0.2 + vize2*0.2 + finalNotu*0.6;
        System.out.println("ortalama = " + ortalama);

        if (ortalama >= 90 && ortalama <= 100){
            System.out.println("Harf Notu : A");
            System.out.println("Dersten Geçtiniz");
        } else if (ortalama >= 80 && ortalama <90) {
            System.out.println("Harf Notu : B");
            System.out.println("Dersten Geçtiniz");
        } else if (ortalama >= 70 && ortalama <80) {
            System.out.println("Harf Notu : C");
            System.out.println("Dersten Geçtiniz");
        } else if (ortalama >= 60 && ortalama <70) {
            System.out.println("Harf Notu : D");
            System.out.println("Dersten Geçtiniz");
        } else if (ortalama >= 0 && ortalama <60) {
            System.out.println("Harf Notu : F");
            System.out.println("Dersten Kaldınız");
        }else{
            System.out.println("Notları yanlış girdiniz tekrar giriniz.");

        }
        System.out.println("Program Bitti");
    }
}
