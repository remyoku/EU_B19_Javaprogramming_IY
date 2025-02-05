package day20_CustomMethods;

public class C01_CustomMethods {
    public static void main(String[] args) {

        System.out.println("Program has Started");

        greetings();
        greetings();
        greetings();

        System.out.println("Program has continued");

        warmGreetings();

        String str = greetingsWithReturnType();//"merhaba dünya"
        System.out.println(str);
        System.out.println(greetingsWithReturnType());


    }

    public static void greetings() {
        System.out.println("Hello World");
    }

    public static void warmGreetings() {
        greetings(); //call the method() from another method
        System.out.println("What's up guys!");
    }

    public static String greetingsWithReturnType() {
        String greetings = "The secret of life is: ! ";

        return greetings;
    }

}
