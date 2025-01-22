package day05_Veriables_cont;

public class C01_Variables {
    public static void main(String[] args) {
        String name = "Ahmet";
        System.out.println("name.toUpperCase() = " + name.toUpperCase());

        int age = 30;



        System.out.println(age);
        System.out.println(age + 1);

        System.out.println(name + age);

        System.out.println(40);

        //decleration

        String surname;

        surname = "Yokus"; //assigment --- atama

        // javada aynı ismi birden fazla kez kullanmamıza izin vermiyor.

        System.out.println(surname);

        byte b1 = 10;
        byte b2 = 20;

        // byte , short ve int ile yapılan matematiksel işlemlerin
        // sonucu her zaman int'tir.

        int i = b1 + b2;

        boolean isOpen = true;

        boolean control = (age > 20);
        System.out.println("control = " + control);

        //iki sayının eşit olup olmadığı

        boolean isEqual;

        isEqual = (b1 == b2);

        System.out.println("isEqual = " + isEqual);

        //normalde javada = işareti atama göstergesidir eşittir demek değildir. Biz iki sayıyı biribine eşit
        //olup olmadığını öğrenmek yada yazdırmak istersek == (iki tane eşittir.) işareti kullanmalıyız.

        //decleration

        int a = 5 ,b = 10 ,c;

        int eklenecekDeger = 5;

        int e = a + eklenecekDeger, d;

        int x;
        int y; //clean code


    }
}
