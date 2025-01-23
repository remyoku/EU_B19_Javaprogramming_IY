package day14_Review;

public class C04_IfExample {
    public static void main(String[] args) {
        //verilen ay değerine göre mevsimi tespit eden kod yazınız.

       int ay =3;

       if (ay >=1 && ay<=12){
           String mevsim = "";
           if (ay >= 3 && ay <=5){
               mevsim="İlkbahar";
           } else if (ay >= 6 && ay <=8) {
               mevsim= "Yaz";
           } else if (ay >= 9 && ay <=11) {
               mevsim="Sonbahar";
           }else {
               mevsim="Kış";
           }
           System.out.println("Mevsim " + mevsim+ " 'dir.");
       }else {
           System.out.println("Yanlış ay girdiniz.");
       }
    }
}
