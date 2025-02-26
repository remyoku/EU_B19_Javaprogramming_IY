package day31_Arrays02;

import java.util.Arrays;

public class C06_StringArrays {
    public static void main(String[] args) {

        String[] cars = {"Honda", "Toyota", "Opel", "Mercedes", "Audi"};

        System.out.println(cars[0].length());//bu 0.indexteki honda uzunluğunu verir.
        System.out.println(cars.length);// bu array uzunluğunu verir
        System.out.println(cars[1].charAt(2));
        System.out.println(cars[3].trim());
        System.out.println(cars[2].substring(1, 3));
        System.out.println(cars[3] == cars[4]);
        System.out.println(cars[3].equals(cars[4]) );

        System.out.println("-------------------------------------");


        //split()
        String str = "It will split the string to the array";

        String[] arr = str.split(" ");  // bu method her bir kelimeyi böler split() böl dediğimiz kısmı da almıyor.
        System.out.println(arr[0]);

        System.out.println("-------------------------------");

        System.out.println(arr.length);
        for (String split  :arr ) {
            System.out.println(split);
        }
        String str1 = "Iphone 15 Promax , 32 GB, 12MP , 1200 ";

        //istediğimiz bir metni split ile alıp istediğimiz yerden bölebiliriz.


        System.out.println(Arrays.toString(cars));

        String[] strArr = Arrays.copyOfRange(cars, 1, 3); // 1 den 3 e kadar olan arrayın
        // elemanlarıı alıyor ve diğer bir arrayin içine atıyor.
        System.out.println(Arrays.toString(strArr));

        System.out.println(strArr.length);

       // sort --- sıralamak

       int [] arry = new int[5];

       arry[0]=34;
       arry[1]=23;
       arry[2]=12;
       arry[3]=4;
       arry[4]=59;

        System.out.println(Arrays.toString(arry)); // küçükten büyüğe doğru sıralıyor.
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));

        System.out.println("--------------------------------------------");

        //fill ()

        int [] arry1 = new int[5];

        arry1[0]=3;
        arry1[1]=2;
        arry1[2]=1;
        arry1[3]=4;
        arry1[4]=5;
        System.out.println(Arrays.toString(arry));
        Arrays.fill(arry1,1,3,10);
        System.out.println(Arrays.toString(arry));

        Arrays.fill(arry1,10);
        System.out.println(Arrays.toString(arry1));
    }
}
