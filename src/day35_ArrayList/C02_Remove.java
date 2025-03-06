package day35_ArrayList;

import java.util.ArrayList;

public class C02_Remove {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();

        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums.isEmpty() = " + nums.isEmpty());
        System.out.println(nums.size() == 0);

        nums.add(1);
        nums.add(23);
        nums.add(45);
        nums.add(12);
        nums.add(34);
        nums.add(27);
        nums.add(245);

        System.out.println(nums.size());
        System.out.println(nums); //[1, 23, 45, 12, 34, 27, 245]

        System.out.println(nums.get(5));
        System.out.println(nums.get(6));

        //remove()
        nums.remove(5); // index noya göre biz o indexi sildik.
        System.out.println(nums);  //[1, 23, 45, 12, 34, 245]
        System.out.println(nums.size());

        Integer obj1 = new Integer(12); //obje şeklinde de remove yapabiliriz.

        nums.remove(obj1); //[1, 23, 45, 34, 245]
        System.out.println(nums);

        System.out.println("-----------------------------------------------");

        // add(index, element) aralara eleman ekliyoruz.

        nums.add(3,35);  //3.indexe 35 ekliyor ve diğer elemanları kaydırıyor.
        System.out.println(nums); //[1, 23, 45, (35 bunu bir element olrak ekledi), 34, 245]
        System.out.println(nums.size());

        System.out.println("-----------------------------------------------");

        //set (index, element) indexin rakamı değişti
        nums.set(3,36);
        System.out.println(nums);


    }
}
