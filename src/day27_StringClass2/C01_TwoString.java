package day27_StringClass2;

public class C01_TwoString {
    public static void main(String[] args) {

        // String s1 = "mUStaFA";
        // String s2 = "sAndAl";

        isim("baŞkenT", "AnKarA");


    }

    public static void isim(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
// B aşkent
        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
// A nkara
        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);

        System.out.println(str1 + " " + str2);

    }
}

