package day12_Switch_Case;

public class C02_SwitchIntro {
    public static void main(String[] args) {

        int sayi = 20;  // sayi 1 ila 4 arası değer alır
        // 10-A
        // 20-B
        // 30-C
        // 40-d
        // dışındaki değerler ise E'dir.

        switch (sayi) {  //byte , short, int , String, Char, (wrapper + Enum)
            case 10 :
                System.out.println("A");
                System.out.println("A");
                break;  // Eğer alta geçmemesini istiyorsam break koymam lazım. yoksa hepsini yazdırır.
            case 20 :
                System.out.println("B");
                System.out.println("B");
                System.out.println("B");
                break;
            case 30:
                System.out.println("C");
                System.out.println("C");
                break;
            case 40:
                System.out.println("D");
                break;
            default:
                System.out.println("E");

        }

// Break ı gördüğü gibi durur yoksa kodu yazdırmaya devam eder.
    }
}
