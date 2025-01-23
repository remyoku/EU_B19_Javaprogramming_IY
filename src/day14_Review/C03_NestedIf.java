package day14_Review;

public class C03_NestedIf {
    public static void main(String[] args) {
        // write a program that checks if the given number is divisable by 2,3,6

        int sayi=60;

        if (sayi%2 == 0){
            System.out.println(sayi + " can bu divided by 2");
            if (sayi%3 == 0){
                System.out.println(sayi + " can bu divided by 3");
                System.out.println(sayi + " can bu divided by 6");
            }else {
                System.out.println(sayi + " cannot bu divided by 3");
                System.out.println(sayi + " cannot bu divided by 6");
            }
        }else {
            System.out.println(sayi + " cannot be divided by 2");
        }
    }
}
