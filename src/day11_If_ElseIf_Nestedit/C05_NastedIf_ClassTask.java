package day11_If_ElseIf_Nestedit;

import java.util.Scanner;

public class C05_NastedIf_ClassTask {
    public static void main(String[] args) {


         // Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını
        //sorun 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
        // 18 ve üzerinde ise yanında bayan olup olmadığını sorun
        // bayan yok ise giremesin
        //bayan var ise yüzme bilip bilmediğiniz sorun
        //yüzme bilmiyor ise yine giriş yapamasın


        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int age=input.nextInt();

        if ( age >= 18){
            System.out.println("Yanınızda bayan var mı? Evet/Hayır");
            String cevap =input.next();
            if (cevap.equalsIgnoreCase("evet")){
                System.out.println("Yüzme biliyor musunuz? Evet/Hayır");
                String cevap2 = input.next();

                if (cevap2.equalsIgnoreCase( "evet")){
                    System.out.println("Havuzumuza hoş geldiniz.");
                }else {
                    System.out.println("Yüzme bilmeyenler havuza giremez.");
                }

            }else if(cevap.equalsIgnoreCase("hayır")){
                System.out.println("Yanınızda bayan yok giremezsiniz.");
            }else {
                System.out.println("Evet veya hayır girmediniz");
            }


        }else {
            System.out.println("Giremezsiniz");
        }


       /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yaş = scanner.nextInt();

        if (yaş>=18){
            System.out.println("Öğrenci misiniz? Evet/Hayır");
            String cvp = scanner.next();
            if (cvp.equalsIgnoreCase("Hayır")){
                System.out.println("Tam Ücret Ödeyiniz");

                } else if(cvp.equalsIgnoreCase("Evet")){
                    System.out.println("İndirimli Tutarı Ödeyiniz");

            }else {
                System.out.println("Lütfen geçerli bir cevap giriniz (Evet/Hayır).");
            }

        }else{
            System.out.println("Bu film sizin için uygun değil.İzleyemezsiniz");
        }
*/



    }
}
