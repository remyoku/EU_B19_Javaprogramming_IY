package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C18_SwitchContinueLabeled {
    public static void main(String[] args) {

        // bir bankacılık menuleri hazırlayalım
        // switch case yapısı içerisinde labeled ifadeler ile menüler arasında gezineleim

        /*
        -anaMenu
        -bankaIslemleri
        -krediKartiIslemleri
         */

        Scanner klavye = new Scanner(System.in);
        int secenek;

        anaMenu:
        while (true){
            System.out.println("------------------------------");
            System.out.println("-----------Ana Menü-----------");
            System.out.println("1- Bankacılık İşlemleri");
            System.out.println("2- Kredi Kartı İşlemleri");
            System.out.println("3- Çıkış");
            System.out.println("------------------------------");
            System.out.print("Seçiminiz+++++++++++++> ");
            secenek = klavye.nextInt();

            switch (secenek){
                case 1:
                    bankaIslem:
                    while (true){
                        System.out.println("------------------------------");
                        System.out.println("-----------Bankacılık Menü-----------");
                        System.out.println("1- Para Çekme");
                        System.out.println("2- Para Yatırma");
                        System.out.println("3- Ana Menü");
                        System.out.println("4- Çıkış");
                        System.out.println("------------------------------");
                        System.out.print("Seçiminiz+++++++++++++> ");
                        secenek = klavye.nextInt();
                        switch (secenek){
                            case 1:
                                System.out.println("Çekeceğiniz Miktarı Giriniz : ");
                                int miktar = klavye.nextInt();
                                System.out.println(miktar + " TL para çekme işlemi gerçekleşti.");
                                continue ;
                            case 2:
                                System.out.println("Yatıracağınız Miktarı Giriniz : ");
                                miktar = klavye.nextInt();
                                System.out.println(miktar + " TL para yatırma işlemi gerçekleşti.");
                                continue ;
                            case 3:
                                continue anaMenu;
                            case 4:
                                break anaMenu;
                            default:
                                System.out.println("<<<<<< Yanlış Seçim>>>>>>>");
                        }
                    }
                case 2:
                    while (true){
                    System.out.println("------------------------------");
                    System.out.println("-----------Kredi Kartı Menü-----------");
                    System.out.println("1- Ekstre Görüntüleme");
                    System.out.println("2- Kredi Kartı Şifre Değiştirme");
                    System.out.println("3- Kredi Kartı Borç Ödeme");
                    System.out.println("4- Ana Menü");
                    System.out.println("5- Çıkış");
                    System.out.println("------------------------------");
                    System.out.print("Seçiminiz+++++++++++++> ");
                    secenek = klavye.nextInt();
                    switch (secenek) {
                        case 1:
                            System.out.println("Kredi Kartı Ekstreniz aşşağıdadır.");
                            continue ;
                        case 2:
                            System.out.print("Yeni Şifreyi Giriniz: ");
                           int yeniSifre = klavye.nextInt();
                            System.out.print("Şifreniz Güncellendi");
                            continue ;
                        case 3:

                            System.out.println("Ödeme miktarı giriniz: ");
                            int miktar = klavye.nextInt();
                            System.out.println(miktar + " Tl kredi kartına yatırıldı.");
                            continue ;
                        case 4:
                            continue anaMenu;
                        case 5:
                            break anaMenu;
                        default:
                            System.out.println("<<<<<< Yanlış Seçim>>>>>>>");
                    }
                    }
                case 3:
                    break anaMenu;
                default:
                    System.out.println("<<<<<< Yanlış Seçim>>>>>>>");
            }

        }
        System.out.println("Bankamızı Tercih Ettiğiniz İçin Teşekkürler....");
    }
}
