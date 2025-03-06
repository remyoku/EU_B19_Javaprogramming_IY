package day34_WrapperClasses;

public class C02_WrapperParseMethods {
    public static void main(String[] args) {
        String str = "1234567.4444";

        Double doubleSayi = Double.parseDouble(str);
        System.out.println("doubleSayi = " + doubleSayi);

        double dblSayi = Double.parseDouble(str);
        System.out.println("dblSayi = " + dblSayi);

       String strInt = "12345";
      int sayıInt = Integer.parseInt(strInt);
        System.out.println("sayıInt = " + sayıInt);
        System.out.println(sayıInt + 5);

        System.out.println("------------------------------");

        /*
        veri yapısı
        1.eleman ---> isim
        2.eleman ---> doğumYılı
        3.eleman ---> doğumİli
        4.eleman ---> doğumÜlkesi
         */

        String str2 = "İrem 1999 Diyarbakır Türkiye";

        System.out.println("str2 = " + str2);
        String[] strArr = str2.split(" ");
        System.out.println("Adı = " + strArr[0]);
        System.out.println("Doğum Yılı = " + strArr[1]);
        System.out.println("Doğum İli = " + strArr[2]);
        System.out.println("Doğum Ülkesi = " + strArr[3]);

        int doğumYılı = Integer.parseInt(strArr[1]);
        int yas = 2025 - doğumYılı;
        System.out.println("yas = " + yas);

        String [] strArrays = {"Eslem 2011 Hatay Türkiye , Hasan 1976 Berlin Almanya", "Selda 1993 Washington ABD"};

        for (String str3  :strArrays ) {
            String[] eleman = str3.split(" ");
            System.out.println("Adı = " + eleman[0]);
            System.out.println("Doğum Yılı = " + eleman[1]);
            System.out.println("Doğum İli = " + eleman[2]);
            System.out.println("Doğum Ülkesi = " + eleman[3]);
            System.out.println();

        }


    }

}
