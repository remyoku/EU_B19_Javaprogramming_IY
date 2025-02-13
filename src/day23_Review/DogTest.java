package day23_Review;

public class DogTest {
    public static void main(String[] args) {

        //            Stack                     Heap
        // Classname objectName = new Keyword ClassName(); --- obje oluşturma yöntemi

             Dog         dog     = new         Dog();

             Dog         dog2    = new         Dog();

             Dog         dog3    = new          Dog();

             dog.ad="Süslü";
             dog.cins="Golden Retriever";
             dog.renk="Sarı";
             dog.yas=4;

        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);

        dog.havla();
        dog.ısır();
        dog.mamaYe();
        dog.suruGit();


        //obje üzerinden fielda yeni atama yapabiliriz.
        dog.yas = 7;

        System.out.println("dog.yas = " + dog.yas);

        //obje üzerinden eylemleri tekrar çağırabiliriz.
        dog.havla();
        dog.mamaYe();

        // Default değerler
        // String için değer null

        System.out.println("dog2.ad = " + dog2.ad);
        System.out.println("dog2.cins = " + dog2.cins);
        System.out.println("dog2.renk = " + dog2.renk);


        //int için default değer 0
        System.out.println("dog2.yas = " + dog2.yas);

        // boolean için default değer false

        System.out.println("dog2.evcilMi = " + dog2.evcilMi);

        // char için default
        System.out.println("dog2.cinsiyet = " + dog2.cinsiyet);

        dog3.ad="Pamuk";
        System.out.println("dog3.ad = " + dog3.ad);

        dog3.havla();
        dog3.mamaYe();
        dog3.ısır();

        dog=dog3;   // böyle yapınca artık dog dog3 bilgilerini refere ediyor.

        System.out.println("dog.ad = " + dog.ad); // normalde süslü idi ama artık pamuk oldu onu refere ettiği için.

        dog.havla();
        dog.mamaYe();
        dog.ısır();
    }
}
