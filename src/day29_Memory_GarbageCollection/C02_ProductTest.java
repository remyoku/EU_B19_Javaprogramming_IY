package day29_Memory_GarbageCollection;

public class C02_ProductTest {
    public static void main(String[] args) {
        C01_Product ürün1 = new C01_Product();
        C01_Product ürün2 = new C01_Product();
        C01_Product ürün3 = new C01_Product();
        // ürün1 , ürün2, ürün3 ---> Heap memory de oluşan nesnenin referansını/adresini
        // barındıran ve stackde oluşan değişkenler

        ürün1.name = "Elma"; // Heap memoryde bulunur.
        ürün1.unitPrice = 15;// Heap memoryde bulunur.

        ürün2.name="Elma";// Heap memoryde bulunur.
        ürün2.unitPrice=15;// Heap memoryde bulunur.

        ürün3.name="Armut";// Heap memoryde bulunur.
        ürün3.unitPrice = 15;// Heap memoryde bulunur.


        System.out.println("ürün1 = " + ürün1);
        System.out.println("ürün2 = " + ürün2);
        System.out.println("ürün3 = " + ürün3);

        System.out.println("(ürün1 == ürün2) = " + (ürün1 == ürün2));

        System.out.println("ürün1.name = " + ürün1.name);
        System.out.println("ürün3.name = " + ürün3.name);

        ürün1=ürün3; // ürün1 artık ürün3 e ait referansını tutmaktadır.

        System.out.println("ürün1 = " + ürün1);
        System.out.println("ürün2 = " + ürün2);
        System.out.println("ürün3 = " + ürün3);

        System.out.println("ürün1.name = " + ürün1.name);
        System.out.println("ürün3.name = " + ürün3.name);


    }
}
