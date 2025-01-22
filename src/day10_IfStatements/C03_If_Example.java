package day10_IfStatements;

public class C03_If_Example {
    public static void main(String[] args) {

        double fizik=50;
        double kimya=40;
        double ortalama = (fizik+kimya)/2;

        System.out.println("ortalama = " + ortalama);

        if (ortalama>50) {
            System.out.println("Ali geçti");
            System.out.println("Öğretmen Aliyi tebrik etti.");
        }else {
            System.out.println("Ali kaldı ");
            System.out.println("Öğretmen Aliye çok çalışmalısın dedi. ");
        }
            System.out.println("Program bitti");

    }
    //If true olduğunda hepsini yazdırıyor.Ama ben aşşağı kısmı eğer true olmazsa diye yazıyorum.
    // Bu yüzden true dan sonra ki kismı else yaparsak sadece true yu yazdırıyor ve bize false u yazdırmaz..
    //Bunları body içine alman lazım, nedir bu body {} süslü parantez.


    /*
    if (condition) {

    Condition true ise bu body nin içimdeki işlemleri yapar.
    Condition false ise bu body nin içimdeki işlemleri atlar.

    }else {
    condition true ise bu body nin içindeki işlemleri atlar
    condition false ise bu body nin içindeki işlemleri yapar

   }
     */
}


 /*
alinin fizik notu 50
kimya notu 30
ortalaması 50 üzerinde ise ekrana geçti yazsın
50 altında ise herhangi bir şey yazdırmasız
 */