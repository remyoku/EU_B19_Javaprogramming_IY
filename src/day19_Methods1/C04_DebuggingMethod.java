package day19_Methods1;

public class C04_DebuggingMethod {
    public static void main(String[] args) {
        System.out.println("Main method içi: satır - 5");
        method();
        System.out.println("Main method içi: satır - 7");
        method();
        System.out.println("Main method içi: satır - 9");
        method();
        System.out.println("Main method içi: satır - 11");
        method();

    }

    public static void method(){
        System.out.println("Method içi : satır - 17");
    }
}
