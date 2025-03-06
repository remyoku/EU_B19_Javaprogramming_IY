package day35_ArrayList;

import java.util.ArrayList;

public class C06_EgualsMethod {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");


        System.out.println(list1);

        ArrayList<String> month= new ArrayList<>();

        month.add("Feb");
        month.add("Jan");
        month.add("Mar");
        month.add("Apr");
        month.add("May");
       // month.add(3); içerisine veri tipini doğru girmeliyiz.
        System.out.println(month);

       if (month.equals(list1)) {
            System.out.println("Her iki list eşittit.");
        }else {
            System.out.println("Listeler farklıdır");
        }

        System.out.println("month.contains(list1) = " + month.contains(list1));


    }
}
