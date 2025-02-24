package day27_StringClass2;

public class C04_Empty {
    public static void main(String[] args) {
        /*
Write a method that asks user to enter a string. ---- Kullanıcıdan string al
if the string is empty, print: string is empty ---- boş ise string boş desin
if the string has more than 3 characters, print the last three characters ---- eğer 3 ve daha fazlası varsa son 3 karakteri yazdırsın
if the string has less than or equal 3 characters, print the string itself ---- 3 ve daha az ise stringin kendisini yazdırsın

ali---> ali
ak----->ak
ankara----> ara
""----> empty

 */

       String str = "Merhaba Dünya";

       if (str.length()==0){
           System.out.println("Empty");

       } else if (str.length()>3) {
           System.out.println(str.substring(str.length()-4)); // bu şekilde yaparak son 4 harfi ver dedim.

       }else {
           System.out.println(str);
       }
       //farklı yapım.
        String kelime= "";

        if (kelime.length()>3) {

            System.out.println("kelime.substring(-3) = " + kelime.substring(kelime.length()-3));

        } else if (kelime.length()<3 && kelime.length()>0) {

            System.out.println("kelime = " + kelime);
        } else if (kelime.length()==0) {
            System.out.println("String is empty.");
        }
    }
}
