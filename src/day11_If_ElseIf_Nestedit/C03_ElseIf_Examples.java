package day11_If_ElseIf_Nestedit;

public class C03_ElseIf_Examples {
    public static void main(String[] args) {

        /*
        Ayşenin cep harçlığı 5 liradan az ise babası 10tl versin
        50 liradan fazla ise babası 20tl sini alsın
        aksi durumda babası para vermesin ve almasın
         */

        int aysePara= 68;
        if (aysePara <5 ){
            aysePara+=10;     //ayseParası = ayseParası+10;

        } else if (aysePara>50) {
            aysePara-=20;
        }else {

        }
        System.out.println("aysePara = " + aysePara);
        System.out.println("----------------------------------------------------------------------------------------");

        /*
        3 adet iç açı olsun ve
        bunun üçgen olup olmadığını kontrol edelim
         */

        int x, y, z;
        x=90;
        y=60;
        z=50;

        int toplam= x+y+z;

        boolean durum = toplam==180;

        if (durum) {
            System.out.println("Bu bir üçgendir");
        }else{
            System.out.println("Bu bir üçgen değildir");
        }
    }
}
