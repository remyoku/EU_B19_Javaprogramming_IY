package day14_Review;

public class C01_GeometricShape {
    public static void main(String[] args) {
        // Verilen kenar sayısından şeklin hangi
        // geometrik şekil olduğunu tespit eden bir program yazın.
        // 3-6 arası kenar sayısı kabul etsin

        int kenarSayisi = 7;
        String sekil = "";

        if (kenarSayisi == 3) {
            sekil = "üçgen";

        } else if (kenarSayisi == 4) {
            sekil = "dörtgen";

        } else if (kenarSayisi == 5) {
            sekil = "beşgen";

        } else if (kenarSayisi == 6) {
            sekil = "altıgen";
        } else {
            System.out.println("Belirlenmemiş şekil.");
        }

        if (kenarSayisi >= 3 && kenarSayisi <= 6)
            System.out.println("Bu bir " + sekil + "'dir.");
// Burada sout a if atamamızın sebebi biz yukarıda verilen data dışında bir başka veri girince
// else i yazdıracak ve sout u boş yapıcak bu yüzden if ile onu şartladık. böyle bir durum da soutu yazdır dedik.
    }
}
