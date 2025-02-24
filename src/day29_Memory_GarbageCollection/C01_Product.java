package day29_Memory_GarbageCollection;

import java.security.PublicKey;

public class C01_Product {

    //Properities, states, fields --> bunlar özellikleri
    //Referans değişkenler
    String name;   //---------> Heap
    double unitPrice; //------> Heap


    //behaviour, function , method of object ----> Stack
    public double fiyatHesapla(int miktar){
        double fiyat = unitPrice*miktar;
        return fiyat;

    }

    public static void main(String[] args) {

        //         STACK            Heap
        C01_Product product = new C01_Product();
        System.out.println("product = " + product);

        product.name="Elma";     //atama yaptığımız gibi heapte oluşuyor. Heap memory oluşuyor.
        product.unitPrice=15;  // bu da Heap memory de oluşur.

        int miktar = 3; //Stack Local bir değişken olduğu için.

        double fiyat = product.fiyatHesapla(miktar); //local bir değişken olduğu için Stackte oluştu.

        System.out.println("product.name = " + product.name);
        System.out.println("product.unitPrice = " + product.unitPrice);
        System.out.println("miktar = " + miktar);
        System.out.println("fiyat = " + fiyat);
    }



}
