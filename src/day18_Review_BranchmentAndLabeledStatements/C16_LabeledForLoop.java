package day18_Review_BranchmentAndLabeledStatements;

public class C16_LabeledForLoop {
    public static void main(String[] args) {

        // nested i ve j döngülerinde
        //i ve j nin çarpımıyla hedef sayıya ulaşınca döngüyü bitiren
        // kode yazınız
        // eğer hedeflenen rakam çarpım sonucunda oluşmuyorsa bu durum ayrıca belirtilsin


        int hedefSayı = 16;
        boolean bulunduMu = false;

        loopA:
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            loopB:
            for (int j = 1; j < 5; j++) {
                System.out.println("j = " + j);
                if (i * j == hedefSayı) {
                    System.out.println("Hedef Sayıya Ulaşıldı.." + hedefSayı);
                    bulunduMu = true;
                    break loopA;
                }

            }

        }
        if (!bulunduMu){
            System.out.println("Hedef sayıya ulaşılamadı "+ hedefSayı);
        }
    }
}
