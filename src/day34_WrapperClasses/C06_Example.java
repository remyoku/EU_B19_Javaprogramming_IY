package day34_WrapperClasses;

public class C06_Example {
    public static void main(String[] args) {
        /*
        String  str = "Bugün hava 25 derece";
        hava sıcaklığı 10 derece daha artarsa sıcaklık ka derece olur?
         */

        String str = "Bugün hava 25 derece";
        String[] strArr = str.split(" ");

        System.out.println( Integer.parseInt(strArr[2] )+ 10);
        System.out.println(Integer.parseInt(str.split(" ")[2] )+ 10);


    }
}
