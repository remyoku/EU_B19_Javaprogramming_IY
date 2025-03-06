package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_WrapperClassesReview {
    public static void main(String[] args) {

        Integer i;
        Byte b;
        Short s;
        Double d;
        Float f;
        Boolean bl;
        Character ch;
        Long l ;
        // Primitive data türlerinin objeye dönüşmüş hali.

        //Boxing
        Integer intObj = Integer.valueOf(10);
        //Auto Boxing

        Integer obje = 25;
        //unboxing
        int y = obje.intValue();
        //Auto unboxing
        int x = obje;

        //Java wrapper classlar ile primitive data türleri arasındaki
        //dönüştürme işelemini otomatik yapar.

       Integer [] arr = {2,3,5,62,-9};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        //parse metodları

        String str = "123";
        int z =Integer.parseInt(str);
        Integer w =Integer.parseInt(str);

        System.out.println("(z+w) = " + (z + w));

        double db = Double.parseDouble("25.25");
        System.out.println("db*25 = " + db * 25);

        //max. Min. değerler

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        //karşılaştırma methodu compare();

        //Integer.compare(int x, int y);
        // x<y ise sonuç -1 oluyor
        // x == y ise sonuç 0 oluyor
        // x > y ise sonuç 1 oluyor

        System.out.println("Integer.compare(10,20) = " + Integer.compare(10, 20));//-1

        System.out.println("Double.compare(5.2,3.8) = " + Double.compare(5.2, 3.8));//1


    }
}
