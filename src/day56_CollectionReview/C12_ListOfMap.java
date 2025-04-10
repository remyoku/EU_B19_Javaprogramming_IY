package day56_CollectionReview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C12_ListOfMap {
    public static void main(String[] args) {

       // Liste oluşturuluyor
        List<Map<String, String>> kisiler = new ArrayList<>();

// Kişi 1
        Map<String, String> kisi1 = new HashMap<>();
        kisi1.put("Adı", "Ahmet");
        kisi1.put("Soyadı", "Yılmaz");
        kisi1.put("Telefon", "0532 123 45 67");
        kisi1.put("Adres", "İstanbul, Kadıköy");
        kisiler.add(kisi1);

// Kişi 2
        Map<String, String> kisi2 = new HashMap<>();
        kisi2.put("Adı", "Ayşe");
        kisi2.put("Soyadı", "Demir");
        kisi2.put("Telefon", "0507 987 65 43");
        kisi2.put("Adres", "Ankara, Çankaya");
        kisiler.add(kisi2);

// Kişi 3
        Map<String, String> kisi3 = new HashMap<>();
        kisi3.put("Adı", "Mehmet");
        kisi3.put("Soyadı", "Kara");
        kisi3.put("Telefon", "0543 456 78 90");
        kisi3.put("Adres", "İzmir, Bornova");
        kisiler.add(kisi3);

// Kişi 4
        Map<String, String> kisi4 = new HashMap<>();
        kisi4.put("Adı", "Elif");
        kisi4.put("Soyadı", "Şahin");
        kisi4.put("Telefon", "0555 112 23 34");
        kisi4.put("Adres", "Bursa, Nilüfer");
        kisiler.add(kisi4);

// Kişi 5
        Map<String, String> kisi5 = new HashMap<>();
        kisi5.put("Adı", "Can");
        kisi5.put("Soyadı", "Aydın");
        kisi5.put("Telefon", "0530 667 78 89");
        kisi5.put("Adres", "Antalya, Muratpaşa");
        kisiler.add(kisi5);

        for (Map<String,String> kisi  : kisiler ) {
            System.out.println(kisi);
        }

        System.out.println("--------------------------------------------");
        System.out.println("kisiler.get(4) = " + kisiler.get(4));
        System.out.println("--------------------------------------------");
        System.out.println("kisiler.get(3).get(\"Soyadı\") = " + kisiler.get(3).get("Soyadı"));

    }
}
