package day08_Assigment_Reletional_Logical_Operators;

import java.util.Scanner;

public class C07_RelationalOperators {
    public static void main(String[] args) {


        int num1 , num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("İki tam sayı giriniz : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        // aşşağıdaki true/false durumları num1 = 125 ve num2= 45 değerleri içindir.

      //'==' is equal operator
        boolean b = num1 == num2;
        // boolean b = (num1 == num2); bu şekilde gösterim daha okunaklıdır..

        System.out.println("b = " + b);
        System.out.println("num1 == num2 ? "+ (num1 == num2)); //false

        //'!=' is not equal operator
        System.out.println("num1 != num2 ? "+ (num1 != num2)); //true

        //'>' is larger operator
        System.out.println("num1 > num2 ? "+ (num1 > num2)); //true

        //'<' is smaller operator
        System.out.println("num1 < num2 ? "+ (num1 < num2)); //false

        //'>=' is larger or equal operator
        System.out.println("num1 >= num2 ? "+ (num1 >= num2)); //true

        //'<=' is smaller or equal operator
        System.out.println("num1 <= num2 ? "+ (num1 <= num2)); //false

       String str ="10";

       //System.out.println(str> num1); hata vardır.





    }
}
