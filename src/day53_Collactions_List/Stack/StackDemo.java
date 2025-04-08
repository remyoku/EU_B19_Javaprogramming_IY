package day53_Collactions_List.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // last in first out

        Stack<String> stackColors = new Stack<>();

        //adding elements to stack  .push()

        stackColors.push("Red");
        stackColors.push("Green");
        stackColors.push("Yellow");
        stackColors.push("Black");

        System.out.println("stackColors = " + stackColors);

        System.out.println( stackColors.pop()); // içinden bir taneyi çek ve çıkart demek
        System.out.println("stackColors = " + stackColors);//stackColors = [Red, Green, Yellow]
        System.out.println(stackColors.pop());//Yellow
        System.out.println("stackColors = " + stackColors);//stackColors = [Red, Green]

        System.out.println("stackColors.peek() = " + stackColors.peek());// son elemanı verir.değişiklik yapmaz.
        System.out.println("stackColors = " + stackColors);

        System.out.println(stackColors.pop());
        System.out.println(stackColors);
        System.out.println(stackColors.pop());
        System.out.println(stackColors);


        if (!stackColors.empty()){
            System.out.println(stackColors.pop());
        }
        System.out.println(stackColors);

        try {
            stackColors.pop();
        }catch (EmptyStackException e){
            System.out.println("Hata : " + e);
            System.out.println("Boş stackten eleman alamazsın");
        }
    }
}
