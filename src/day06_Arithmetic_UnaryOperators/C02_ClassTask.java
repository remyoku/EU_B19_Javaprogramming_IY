package day06_Arithmetic_UnaryOperators;

public class C02_ClassTask {
    public static void main(String[] args) {
        /*
        Task 1
        Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.
İfadesini bir değişkene atayın ve yıl başka bir değişken ile
kontrol edilebilsin.
TASK

         */

        int yil = 1453;
        String str = "Fatih Sultan Mehmet " + yil + " yılında İstanbul u fethetmiştir.";
        System.out.println(str);

        /*
        Task 2
        Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?


                Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali ,Ahmet
        den 5 yaş büyük olduğuna göre Ahmet kaç yaşındadır.

        Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali , Ahmetten
        5 yaş büyük olduğuna göre Ahmet kaç yaşındadır
                */

        int dogumYili = 1990;
        int yasAli = 2025 - dogumYili;
        System.out.println("yasAli = " + yasAli);
        // Ali'nin yaşı 35 dir. yazdır.
        System.out.println("Ali'nin yaşı " + yasAli + " dır.");

        int yasAhmet = yasAli - 5;
        System.out.println("Ali'nin yaşı " + yasAli + " dır.");
        System.out.println("Ahmet'in yaşı " + yasAhmet + " dır.");

        /*
Task 3
//300 Fahrenheit kaç Celsius ‘dur?
// (°C=(°F-32)/1.8)
*/
        double f = 300;
        double c = (f - 32) / 1.8;
        System.out.println(f + "Fahrenheit" + c + "Celsius ' dur");


        //Task4
                //Ali fizik dersinden 92,
               // kimya dersinden 55,
              // matematik dersinden 89 almıştır.
             //1.Ali’nin not ortalaması kaçtır?

        double fizik = 92;
        double kimya = 55;
        double mat = 89;
        double ort = (fizik + kimya + mat) / 3;
        System.out.println(ort);



    }
}
