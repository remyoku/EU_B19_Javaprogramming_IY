package day56_CollectionReview;

import java.util.*;

public class C04_SetExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(3,32,65,98,21));

        System.out.println("allUniqe(nums) = " + allUniqe(nums));
        System.out.println("allUniqe2(nums) = " + allUniqe2(nums));
    }
    //bir listin elemenalrının benzersiz olup olmadığını kontrol eden method nedir?
    //method ,eğer bütün elementler benzersiz ise true
    // değilse false dönmelidir.

    private static boolean allUniqe(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>(numbers);
        return set.size() == numbers.size();
    }

    private static boolean allUniqe2(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();

        for (Integer i : numbers) {
            if (!set.add(i)) {
                return false;
            }
        }
        return true;
    }
}
