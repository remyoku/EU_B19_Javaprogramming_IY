package day28_StringReview;

public class C08_LongestSubstringWithOutRepeat {
    public static void main(String[] args) {

        System.out.println(longestSubstringWithoutRepeat("abcdefgdad"));

    }

    public static int longestSubstringWithoutRepeat(String str) {
        String result = "";
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i + 1); //burda aldı
            for (int j = i + 1; j < str.length(); j++) {
                if (!result.contains(str.substring(j, j + 1))) { //burda bakıyor o harf var mı eğer yoksa ekliyor tekrar
                    result += str.substring(j, j + 1); //bakıyor yoksa hepsini ekliyor varsa break oluyor.
                } else {
                    break;
                }
                max = Math.max(max, result.length());
            }
        }
        return max;
    }
}
/**
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */