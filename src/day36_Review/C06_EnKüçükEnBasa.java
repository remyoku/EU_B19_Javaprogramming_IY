package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_EnKüçükEnBasa {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 36, 3, 0, -6, 32, 2, 4, -6, 7));

        System.out.println("enKucukEnBasa(list) = " + enKucukEnBasa(list));

    }
    //listin içindeki en küçük sayıyı en başa anlan methodu yazınız.
    // diğer sayılar sıraya dizilmeyecek . (sort kullanılmayacak)
    public static ArrayList<Integer> enKucukEnBasa(ArrayList<Integer>numbers){

        int min = numbers.get(0);
        int minIndex = -1;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min){
                min = numbers.get(i);
                minIndex = i;
            }
        }
       numbers.remove(minIndex);
       // numbers.remove(numbers.indexOf(min));
        numbers.add(0,min);

        return numbers;
    }
}
