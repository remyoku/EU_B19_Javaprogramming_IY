package day27_StringClass2;

public class C02_Replace {
    public static void main(String[] args) {

        String s1 = "Java  Java  Java";
        s1 = s1.replace("a","e");

        System.out.println("s1 = " + s1);

        String s2 = "Java  Java  Java";

        s2 = s2.replace("Java","Phyton");
        System.out.println("s2 = " + s2);

        String s3 = "Java  Java  Java";
        s3 = s3.replaceFirst("Java","Phyton"); // replaceFirst yapınca ilk i değiştiriyor ilk kelimeyi

        System.out.println("s3 = " + s3);

        String s4 = "Java1  Java2  Java3";
        s4 = s4.replaceAll("[0-9]","Phyton");// 0 dan 9 a kadar sayıları al bununla değiştir.
        System.out.println("s4 = " + s4);
    }
}
