package day26_StringClass01;

public class C04_StartsWithEndsWith {
    public static void main(String[] args) {

        String str = "Herşey çok güzel";
        System.out.println("str.startsWith(\"H\") = " + str.startsWith("H"));
        System.out.println("str.startsWith(\"h\") = " + str.startsWith("h"));
        System.out.println("str.startsWith(\"Her\") = " + str.startsWith("Her"));
        System.out.println("str.startsWith(\"Herşey çok gü\") = " + str.startsWith("Herşey çok gü"));
        System.out.println("str.startsWith(\"Herşeyçok gü\") = " + str.startsWith("Herşeyçok gü"));


        System.out.println("str.endsWith(\"\") = " + str.endsWith(""));
        System.out.println("str.endsWith(\"l\") = " + str.endsWith("l"));
        System.out.println("str.endsWith(\"zel\") = " + str.endsWith("zel"));
        System.out.println("str.endsWith(\"uzel\") = " + str.endsWith("uzel"));


        // başlangıçtan ve sondan kelimeleri karşılaştırmak için kullanıyoruz
        // bununla mı başlıyor bununla mı bitiyor --> boolean verir
    }
}
