package day04_Variables;

public class C01_PrimitiveDataType {
    public static void main(String[] args) {
        // age = 48 years old
        byte myAge;  // declaration burda kutuyu oluşturdum

        myAge = 48;  //assignment -- atama burda kutunun içerisine 48 sayısının atamasını yaptım

        System.out.println(myAge);
        System.out.println("myAge");

        myAge = 55;
        System.out.println(myAge);

        System.out.println("-------------------");

        //weight = 95

        short myWeight = 95;     // declaration and assignment
        System.out.println(myWeight);

        System.out.println("----------------");

        // Annual salary =75000 euro
        int mySalary = 75000;
        System.out.print("My salary is:");
        System.out.println(mySalary);

        System.out.println("-------------");

        // world population
        long worldPopulation;
        worldPopulation = 8056338000L;  //Long ile atama yaptığımız zaman sayının sonuna ya büyük L ya da küçük l olmalı
        System.out.println(worldPopulation);





    }




}
