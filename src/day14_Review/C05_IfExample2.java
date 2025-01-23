package day14_Review;

public class C05_IfExample2 {
    public static void main(String[] args) {

        //Elimizde belirli sayıda 5 kiloluk ve 1 kiloluk un paketleri var
        //Müşterinin talep ettiği kilo sayıda paketi verip veremeyeceğimizikontrol eden bir program yazın.

        int beşlikPaketSayısı = 6;
        int birlikPaketSayısı = 2;
        int talep = 0;
        boolean karşılanabilirMi = false;

        if (talep >0){

            if (beşlikPaketSayısı*5>=talep){
                if (birlikPaketSayısı>=talep%5);{
                    karşılanabilirMi =true;

                }
            }else if (birlikPaketSayısı >= talep-beşlikPaketSayısı*5){
                karşılanabilirMi=true;
            }

            if (karşılanabilirMi){
                System.out.println(talep + " kilo talebiniz depolarımızda mevcut");
            }else {
                System.out.println(talep + " kilo talebiniz depolarımızda mevcut değil.");
            }
        }else {
            System.out.println("Talebi yanlış oluşturdunuz");
        }


        }
}




