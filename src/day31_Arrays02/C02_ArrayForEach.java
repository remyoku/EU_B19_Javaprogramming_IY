package day31_Arrays02;

public class C02_ArrayForEach {
    public static void main(String[] args) {

        String [] sehirler = {"Adana", "Ankara", "Bursa" , "İstanbul", "Diyarbakır"};

        for (int i = 0; i < sehirler.length ; i++) {
            System.out.println("sehirler[i] = " + sehirler[i]);
        }

        System.out.println("-----------------------------------");

        for ( String sehir :sehirler ) {
            System.out.println("sehir = " + sehir);
        }
        System.out.println("-----------------------------------");

        for (String sehir  : sehirler ) {
        		    if (sehir.equals("Diyarbakır")){
                        System.out.println("sehir = " + sehir.toUpperCase());
                    }else {
                        System.out.println("sehir = " + sehir);
                    }
        		}
    }
}
