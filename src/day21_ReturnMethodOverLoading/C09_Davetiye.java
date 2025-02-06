package day21_ReturnMethodOverLoading;

import java.util.Scanner;

public class C09_Davetiye {
    public static void main(String[] args) {
        davetiye();

    }
    public static void davetiye(){

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Kelime");
            String kelime1 = scanner.nextLine();
            System.out.println("2.Kelime");
            String kelime2 = scanner.nextLine();

            if (kelimeKontrol(kelime1, kelime2)) {
                System.out.println("Kelimeler Farklı Olmalıdır");
                continue;
            } else {
                davetiyeYazdır(kelime1, kelime2);
                break;  //return; da yazıp bitirebiliriz.
            }
        }
    }
    public static boolean kelimeKontrol(String kelime1 , String kelime2){

        return kelime1.equals(kelime2);
    }

    public static void davetiyeYazdır(String str , String str2){
        System.out.println("**************** "+ str+ " ************** "+str2+" ***************** ");

    }
}
//Kullanıcıdan
//2 adet kelime isteyen bir metodunuz olsun Bu metot
//kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun Eğer
//kullanıcı kelimeler yanlışlıkla aynı girerse Başka bir metot çağrılsın ve
//kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
//istesin Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
//bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin