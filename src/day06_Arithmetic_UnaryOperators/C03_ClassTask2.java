package day06_Arithmetic_UnaryOperators;

public class C03_ClassTask2 {
    public static void main(String[] args) {

        int i = 10;
        int j = 3;
        int k = i/j;  // 3.3 olsa bile int e atadığımız için küsürlü yapmaz. Tam sayı verir küsürat gider.
        System.out.println("k = " + k);
        System.out.println("---------------------------------------------");

        // 4500 dakika kaç saat eder?

        int dk = 4530;
        int saat = dk/60;
        int kalanDk = dk%60;
        System.out.println(dk  + " dakika " + saat + " saat " + kalanDk + " dakikadır ");
        System.out.println("-----------------------------------");

        //31502 saniye kaç saat kaç dakika kaç saniyedir?
        // (1 saat 60 dakika 1 dakika 60 sn)

        int totalSecond = 31502;
        int hour = totalSecond / 3600;
        int min = totalSecond%3600 /60;
        int second = totalSecond%60;
        System.out.println(31502 + " saniye " + hour +  " saat " + min + " dakika " + second + " saniyedir. ");





    }
}
