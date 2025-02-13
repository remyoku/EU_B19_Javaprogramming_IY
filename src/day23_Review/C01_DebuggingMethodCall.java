package day23_Review;

public class C01_DebuggingMethodCall {
    public static void main(String[] args) {

        System.out.println("Main method içerisindeyim satır 6");
        method();
        System.out.println("Main method içerisindeyim satır 8");
        method();
        System.out.println("Main method içerisindeyim satır 10");
        method();
        System.out.println("Main method içerisindeyim satır 12");




    }

    public static void method(){
        System.out.println("Method içerisindeyim : satır 20 ");
    }
}
