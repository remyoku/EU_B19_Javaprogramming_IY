package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_RemoveInALoop {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("kayak", "ata", "atak", "amma", "yaka", "aka", "kırık"));

        System.out.println("removePalindrome(list) = " + removePalindrome(list));
    }
    // bir listte bulunan palindrome kelimeleri silen methodu yazınız.

    public static ArrayList<String > removePalindrome(ArrayList<String> words){
        for (int i = 0; i < words.size(); ) {
            if(isPalindrome(words.get(i))) {
                words.remove(words.get(i));
            }else {
                i++;
            }
        }
        return words;
    }

    public static ArrayList<String > removePalindrome_ForEach(ArrayList<String> words){

        for (String word : words){
            if (isPalindrome(word)){
                words.remove(word);
            }
        }

        return words;
    }

    public static ArrayList<String > removePalindrome_1(ArrayList<String> words){
        ArrayList<String > sonuc = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if (!isPalindrome(words.get(i))){
                sonuc.add(words.get(i));
            }
        }
        return sonuc;
    }
//bu şekilde palindrome olup olmadığını kontrol ediyoruz.
    public static boolean isPalindrome(String word){
        String reverseWord = "";
        for (int i = word.length()-1 ; i >=0 ; i--) {
            reverseWord += word.charAt(i);
        }
        return word.equals(reverseWord);
    }
}
