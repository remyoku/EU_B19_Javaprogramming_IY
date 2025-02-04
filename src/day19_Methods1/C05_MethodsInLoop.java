package day19_Methods1;

public class C05_MethodsInLoop {
    public static void main(String[] args) {

        System.out.println("Loop öncesi");

        for (int i = 1; i <=5 ; i++) {
            displayMessage();
            System.out.println("Loop içi");
        }
        System.out.println("Loop sonrası");
    }
    public static void displayMessage(){
        System.out.println("Message is displayed");
    }
}
