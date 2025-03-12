package day40_Encapsulation02.Bank;

import java.util.ArrayList;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Tl","123",100);
        Account account2 = new Account("Pound","2569",1000);
        Account account3 = new Account("Dolar","34",1000);

        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);
        System.out.println("account3 = " + account3);

        System.out.println("account1.getTypes() = " + account1.getTypes());

        ArrayList<String > hesapTurleri = account1.getTypes();

        hesapTurleri.add("Karpuz");
        hesapTurleri.add("Armut");

        System.out.println("hesapTurleri = " + hesapTurleri);

        System.out.println("hesapTurleri.hashCode() = " + hesapTurleri.hashCode());
        System.out.println("account1.getTypes().hashCode() = " + account1.getTypes().hashCode());

        Account account4 = new Account("Armut","12345",1200);
        System.out.println("account4 = " + account4);


    }

}
