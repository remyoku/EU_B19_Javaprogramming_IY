package day04_Variables;

public class C02_VariablePractice {
    public static void main(String[] args) {
        byte sinifMevcudu = 10;
        System.out.println(sinifMevcudu);


        short num1 = 30000;
        System.out.println(num1);

        int num2 = 814578;
        System.out.print("Sınıf Mevcudu=");
        System.out.println(sinifMevcudu);
        System.out.println("-------------------");
        System.out.println(num2);
        System.out.println("----------------");

        /*
        Kısayollardan biride uzun uzun yazmak yerine mesela num1 i yazdırmak istiyorum o zaman yapmam
        gereken num1.sout yazmak bu bana --> System.out.println(num1) i verir yada "----------".sout bunlar gibi
         */

        System.out.println(5 + 4);
        System.out.println("----------------------");

        System.out.println("Sınıf Mevcudu = " + sinifMevcudu);
        //Tek satırda + değişkenini kullanarak tek tek yazmaktan kurtuluruz.

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
        // Birde yine pratiklik için num2.soutv yaparsak bize System.out.println("num2 = " + num2); yazdırır.

        System.out.println("--------------------------");

        long num3 = 9_999_999_999L;
        System.out.println("num3 = " + num3);
        System.out.println(num3 + 5);

        System.out.println("-----------------------");

        char ch1 = 'A';
        /*Charecterin atamasını tek tırnak('') ile yapıyoruz. "" tırnak olursa java onu metin olarak kabul eder
        character olarak kabul etmez.

         */
        System.out.println(ch1);
        System.out.println("ch1 = " + ch1);
        System.out.println("----------------------------");

        boolean isMarried = true;
        System.out.println("isMarried = " + isMarried);

        System.out.println("--------------------------------");

        //Pi= 3.14
        double PI = 3.14; // değiştirelemeyecek ifadelerin hepsi büyük harfle yazılır. PI gibi
        System.out.println("PI = " + PI);

        float kalemUcu = 0.5f;
        System.out.println("kalemUcu = " + kalemUcu);

        //Double ve float ile virgüllü sayıları yazarız.
        System.out.println("------------------------------");

        String str = "Eurotech Study is good.";

        System.out.println("str = " + str);

    }
}
