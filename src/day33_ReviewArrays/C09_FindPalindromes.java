package day33_ReviewArrays;

public class C09_FindPalindromes {
    public static void main(String[] args) {

        String[] words = {"kayak","ata","kaya","ali","ama","kek","adam","madam"};
        System.out.println("findPalindromes(words) = " + findPalindromes(words));

        //verilen arraydeki palidrom kelimeleri stringe depolayan methodu yazınız.
        //kelimeler arasına - konulmalıdır.

    }
    public static String findPalindromes(String[] kelimeler){
        String result = "";

        for (String kelime  :kelimeler ) {
        		    if (isPalindrome(kelime)){
                        result +=kelime + "-";
                    }
        		}
        return result.substring(0,result.length()-1);
    }

    private static boolean isPalindrome(String kelime) {
        String kelimeninTersi = "";
        for (int i = kelime.length()-1; i >=0 ; i--) {
            kelimeninTersi +=kelime.charAt(i);
        }
        return kelime.equals(kelimeninTersi);
    }
}
