package day34_WrapperClasses;

public class C05_WrapperLetterIsMethod {
    public static void main(String[] args) {

        String str =   "Abc6846294**89812)7&5+89123ABc&4Ankara646-9813asa7";
    }

    public static void parseString(String str) {

        String letters = "";
        String number = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) { // harf bi kontrol et harfe ata
                letters += str.charAt(i);
            } else if (Character.isDigit(str.charAt(i))) { // sayı ise al sayıya ata
                number += str.charAt(i);
            } else {
                specialChars += str.charAt(i);

            }
        }
        System.out.println(letters);
        System.out.println(number);
        System.out.println(specialChars);

    }

}
