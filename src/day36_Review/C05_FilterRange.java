package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_FilterRange {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 36, 3, 0, -6, 32, 2, 4, 6, 7));


        System.out.println("filterRange(list,3,7) = " + filterRange(list, 3, 7));
    }
    //liste içindeki rakamları verilen aralığa göre filtreleyelim
    //list(), 3,7 3 --> ve 7 aralığı dışındaki rakamları silecek.sınırlar dahil

    public static ArrayList<Integer> filterRange(ArrayList<Integer> nums, int min, int max) {

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num >= min && num <= max){
                result.add(num);
            }
        }
        return result;
    }
}
