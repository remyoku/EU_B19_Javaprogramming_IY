package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_TwoDimensionalArrayExample1 {
    public static void main(String[] args) {


        //Arraylerin methodları varmıdır?
        //clone çoğaltma methodu var
        //arraylar de Arrays. classı  içerisinde methodlaeı var.

        //object classı bütün classların atası sayılıyor
        //obje classı içerisine bir method konulmuşsa bütün classalr bu methodu kullanabilir.
        //bazı classların methodu olması kendilerinden kaynaklanmıyor obje classın dan geliyor.Yani atasından.

        //multi dimentional array
        //ilki          satır ikincisi sütun
        //matrix = new in[5]             [5];

        System.out.println("Two dimensional arrays in Java");

        int[][] numbers = new int[3][3]; //bu iki köşeli parantez bize multi olduğunu ifade eder
        // 3 satır 3 sütun = 9 elemanlı

        //     0.sütun  2.sütun  3.sütun
        //0.satır 0      0        0
        //1.satır 0      0        0
        //2.satır 0      0        0

        numbers[0][0] = 1;
        numbers[0][1] = 5;     // 1 , 5 , 17 biz satırlara atıyoruz. 1 .yol
        numbers[0][2] = 17;
        System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));
        // sout u burda verirsek diğerlerine atama yapmadığımız için 000 verir.

        int[] birArray = {19, 0, -6};   // 2. şekil
        numbers[1] = birArray;

        numbers[2] = new int[]{2, 30, -99};  // 3 .şekil

        System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));

        //3 faklı şekilde satırlara atama yapıyoruz.

        //literal way  ile two dim array oluşturma

        String[][] names = {
                {"Harun", "Hacer"},
                {"İrem", "Eslem"},
                {"İkbal", "Ömer"}

        };
        System.out.println("names[1][2] = " + names[1][1]); // Eslem

        System.out.println("names.length = " + names.length); // satır sayısını yazdırır 3 tane

        //herhangi bir satırda ki eleman sayısı nasıl yazdırılır?

        System.out.println("names[0].length = " + names[0].length);//2
        System.out.println("names[1].length = " + names[1].length);//2
    }
}
