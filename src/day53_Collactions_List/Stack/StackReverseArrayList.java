package day53_Collactions_List.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackReverseArrayList {
    public static void main(String[] args) {

        List<String > colorsArrayList = new ArrayList<>();
        colorsArrayList.add("Mavi");
        colorsArrayList.add("Sarı");
        colorsArrayList.add("Kırmızı");
        colorsArrayList.add("Yeşil");

        System.out.println("colorsArrayList = " + colorsArrayList);

        Stack<String> stackColos = new Stack<>();

        for (String color: colorsArrayList ) {
        		    stackColos.push(color);
        		}
        System.out.println("stackColos = " + stackColos);


        List<String > reversedArrayList = new ArrayList<>();
        while (!stackColos.empty()){
            reversedArrayList.add(stackColos.pop());
        }
        System.out.println("reversedArrayList = " + reversedArrayList);

        Collections.reverse(colorsArrayList);
        System.out.println("colorsArrayList = " + colorsArrayList);
    }
}
