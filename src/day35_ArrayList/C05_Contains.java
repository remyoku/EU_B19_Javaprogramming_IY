package day35_ArrayList;

import java.util.ArrayList;

public class C05_Contains {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");

        list1.add("Jun");
        System.out.println(list1);

        ArrayList<String> list2 = list1;
        System.out.println(list2);

        ArrayList<String> month= new ArrayList<>(list1);
        System.out.println(month);

        //Feb indexinin 1 olduğunu nasıl anlayabiliirm?
        System.out.println(month.indexOf("Feb") == 1);
        System.out.println(month.get(1).equals("Feb"));

        System.out.println(month.contains("May"));
        System.out.println(month.contains("Dec")); // bunun içinde bu var mı? bunu bize smylüyor.

        System.out.println(month.containsAll(list1)); //bu da tek seferde bir arraylistin içinde
                                                        // başka arraylist var mı diye control sağlıyor.

        if (month.containsAll(list1)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }


    }
}
