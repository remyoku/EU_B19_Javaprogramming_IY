package day26_StringClass01;

public class C03_IsEmpty {
    public static void main(String[] args) {
        String str = "Merhaba";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false

        str = "";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false

        str = " ";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());//false

        // ikiside boş mu demek empty de boşluk bile olsa hayır boş değil der. Blank ise evet boş der

        str = "            ";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());//false






    }
}
