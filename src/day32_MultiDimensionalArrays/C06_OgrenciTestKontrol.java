package day32_MultiDimensionalArrays;

public class C06_OgrenciTestKontrol {
    public static void main(String[] args) {

       // 8 öğrenciye ait cevaplar
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //1.Öğrenci Cevapları
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, //2.Öğrenci Cevapları
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, //3.Öğrenci Cevapları
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, //4.Öğrenci Cevapları
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //5.Öğrenci Cevapları
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //6.Öğrenci Cevapları
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //7.Öğrenci Cevapları
                {'D', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'} //8.Öğrenci Cevapları
        };

        //doğru cevap anahtarı
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        System.out.println("Öğrenci Not Sonuçları");

        for (int ogrenci = 0; ogrenci < answers.length; ogrenci++) {
            int dogruCevapSayisi= 0 ;
            String yanlis = "";

            for (int cevap = 0; cevap < answers[ogrenci].length; cevap++) {
                if (answers[ogrenci][cevap] == keys[cevap]){
                    dogruCevapSayisi++;
                }else {
                    yanlis += cevap + 1 + " - " + answers[ogrenci][cevap]+"->"+keys[cevap]+ " / ";
                }
            }
            System.out.println(ogrenci+1 + ". öğrencinin doğru cevap sayısı: " + dogruCevapSayisi);
            System.out.println("Yanlış cevaplar : " + yanlis);
        }


    }
}
