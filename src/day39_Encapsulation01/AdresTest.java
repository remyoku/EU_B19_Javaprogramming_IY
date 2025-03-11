package day39_Encapsulation01;

public class AdresTest {
    public static void main(String[] args) {

        Adress adress = new Adress("Atatürk caddesi no : 235","İstanbul","Türkiye");
        System.out.println("adress = " + adress);

        adress.setStreet("");
        System.out.println("adress = " + adress);
    }
}
