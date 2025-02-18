package day26_StringClass01;

public class C06_ReverseString {
    public static void main(String[] args) {

        String str = "EY EDİP ADANADA PİDE YE";

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse +=str.charAt(i);

        }
        System.out.println("str = " + str);
        System.out.println("reverse = " + reverse);

        // bu şekilde metni tersten yazdırdık
        // son karakterden başlayıp boş bir string e atadık ve böylece ters yazdık
        //Mülakat sorusu
    }
}
