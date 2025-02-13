package day23_Review;

public class C02_HierarcicalMethodCall {
    public static void main(String[] args) {
        System.out.println("Main Method");
        meajGöster();
        System.out.println("Tekrar Main Method");


    }
    public static void meajGöster(){
        System.out.println("Merhaba Dünya");
        hesapMakinası();
        System.out.println("Tekrar mesaj göster methodunda");
    }

    public static void hesapMakinası(){
        System.out.println(10*3/2+1);
    }
}
