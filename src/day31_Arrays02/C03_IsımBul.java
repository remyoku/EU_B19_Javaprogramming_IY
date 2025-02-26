package day31_Arrays02;

public class C03_IsımBul {
    public static void main(String[] args) {

        // Verilen isim dizisi icerisinde 'A' harfi ile baslayanlari
       // for eaach kullanarak tespit edip bastiran bir code yaziniz

        String [] isimler = {"Aİrem", "AEslem", "İkbal", "Ömer","Harun","Hacer","Homi"};

        for (String isim  :isimler ) {
        		    if (isim.charAt(0) == 'A'){
                        System.out.println("isim = " + isim);
                    }
        		}
    }
}
