package day30_Arrays01;

import java.util.Scanner;

public class C09_ÜrünAra {
    public static void main(String[] args) {

   // Kullanicidan bir urun alarak, urunun listede olup olmadigini bildiren bir program yaziniz

        String [] ürünler ={"Elma","Armut","Muz","Karpuz","Şeftali"};

        System.out.println("Lütfen bir ürün giriniz: ");
        Scanner sc = new Scanner(System.in);
        String arananÜrün = sc.nextLine();

       boolean flag = false;

        for (int i = 0; i <ürünler.length ; i++) {
            if (ürünler[i].equalsIgnoreCase(arananÜrün)){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println("Aranan ürün listede mevcuttur...");
        }else {
            System.out.println("Aranan ürün listede yok...");
        }
    }
}
